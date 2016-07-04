package Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7 on 23.06.2016.
 */
// Проверяет выпускников-мужчин на достижение 23-х летнего возраста
public class StudentCheckerImplExecutor implements Executor<TaskImpl, ValidatorImpl>{
    List<Student> listOfAdultStudentMales = new ArrayList<>();
    List<Student> listOfOtherStudents = new ArrayList<>();
    public boolean executed;

    
    @Override
    public void addTask(TaskImpl task) {
        if (!executed) {
            task.execute();
        } else {
            System.out.println("Task has been already executed");
        }
    }

    @Override
    public void addTask(TaskImpl task, ValidatorImpl validator) {
        if (!executed) {
            task.listOfStudents.add(new Student("Male", "Maxim", 20, 3));
        } else {
            System.out.println("Task has been already executed");
        }
    }

    @Override
    public void execute(TaskImpl task, ValidatorImpl validator) {
        List<Student> allStudents = task.listOfStudents;
        for (Student stud : allStudents) {
            if (validator.isValid(stud)) {
                listOfAdultStudentMales.add(stud);
            } else {
                listOfOtherStudents.add(stud);
            }
        }
        executed = true;
    }

    @Override
    public List getValidResults() {
        return listOfAdultStudentMales;
    }

    @Override
    public List getInvalidResults() {
        return listOfOtherStudents;
    }
}
