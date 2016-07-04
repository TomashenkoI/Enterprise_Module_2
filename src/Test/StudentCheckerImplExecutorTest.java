package Test;

import Main.Student;
import Main.StudentCheckerImplExecutor;
import Main.TaskImpl;
import Main.ValidatorImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7 on 04.07.2016.
 */
public class StudentCheckerImplExecutorTest {

    @Test
    public void testAddTask() {
        StudentCheckerImplExecutor executor = new StudentCheckerImplExecutor();
        TaskImpl task = new TaskImpl();
        ValidatorImpl validator = new ValidatorImpl();


        executor.execute(task, validator);
        executor.addTask(task);

        Assert.assertEquals(executor.executed, true);
    }

    @Test
    public void testGetValidResults() {
        StudentCheckerImplExecutor executor = new StudentCheckerImplExecutor();
        TaskImpl task = new TaskImpl();
        ValidatorImpl validator = new ValidatorImpl();

        task.execute();
        executor.execute(task, validator);
        ArrayList<Student> students = task.listOfStudents;
        List<Student> listOfValidStuddents = executor.getValidResults();
        List<Student> listOfInvalidStuddents = executor.getInvalidResults();
        ArrayList<Student> students1 = new ArrayList<>();

        for (int i = 0; i < listOfInvalidStuddents.size(); i++) {
            students1.add(listOfInvalidStuddents.get(i));
        }
        for (Student student : listOfValidStuddents) {
            students1.add(student);
        }

        Assert.assertEquals(students1.size(), students.size());
    }

    @Test
    public void testValidatorImpl() {
        ValidatorImpl validator = new ValidatorImpl();
        Student student = new Student("male", "Vasya", 18, 2);

        Assert.assertEquals(false, validator.isValid(student));
    }

    @Test
    public void testValidatorImpl2() {
        ValidatorImpl validator = new ValidatorImpl();
        Student student = new Student("male", "Senya", 23, 5);

        Assert.assertEquals(true, validator.isValid(student));
    }
}
