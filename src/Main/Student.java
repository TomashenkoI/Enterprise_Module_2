package Main;

/**
 * Created by 7 on 23.06.2016.
 */
public class Student extends Person {
    private int gradeOfCourse;

    public Student(String sex, String name, int age, int gradeOfCourse) {
        super(sex, name, age);
        this.gradeOfCourse = gradeOfCourse;
    }

    public int getGradeOfCourse() {
        return gradeOfCourse;
    }

    public void setGradeOfCourse(int gradeOfCourse) {
        this.gradeOfCourse = gradeOfCourse;
    }

    @Override
    public String toString() {
        return "{" +
                "Name=" + getName()+
                "; Age=" + getAge()+
                "; Course=" + getGradeOfCourse()+
                '}';
    }
}
