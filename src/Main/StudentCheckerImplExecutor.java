package Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7 on 23.06.2016.
 */
// Проверяет выпускников-мужчин на достижение 23-х летнего возраста
public class StudentCheckerImplExecutor implements Executor<Student>{
    List<Student> listOfAdultStudentMales = new ArrayList<>();
    List<Student> listOfOtherStudents = new ArrayList<>();
    
    @Override
    public void addTask(Task<Student> task) {
        task.execute();
    }

    @Override
    public void addTask(Task<Student> task, Validator <Student> validator) {


    }

    @Override
    public void execute(Task<Student> task, Validator <Student> validator) {
        List<Student> allStudents = task.getResult();
        for (Student stud : allStudents) {
            if (validator.isValid(stud)) {
                listOfAdultStudentMales.add(stud);
            } else {
                listOfOtherStudents.add(stud);
            }
        }
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
