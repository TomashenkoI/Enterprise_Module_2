package Main;

import java.util.ArrayList;

/**
 * Created by 7 on 23.06.2016.
 */
public class TaskImpl implements Task<Student>{

    public ArrayList<Student> listOfStudents = new ArrayList<>();


    @Override
    public void execute() {
        listOfStudents.add(new Student("male", "Alex", 19, 3));
        listOfStudents.add(new Student("male", "Igor", 22, 4));
        listOfStudents.add(new Student("female", "Lena", 22, 4));
        listOfStudents.add(new Student("female", "Sasha", 23, 5));
        listOfStudents.add(new Student("male", "Andrei", 23, 5));
        listOfStudents.add(new Student("male", "Anton", 18, 1));
        listOfStudents.add(new Student("male", "Dima", 23, 5));
        listOfStudents.add(new Student("female", "Liza", 20, 2));
        listOfStudents.add(new Student("male", "Sergei", 24, 5));
    }

    @Override
    public Student getResult() {
        System.out.println(listOfStudents);
        return null;
    }
}
