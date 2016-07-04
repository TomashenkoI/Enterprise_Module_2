package Main;

/**
 * Created by 7 on 23.06.2016.
 */
public class ValidatorImpl implements Validator<Student> {

    @Override
    public boolean isValid(Student student) {
        if (student.getSex().equals("male")) {
            if (student.getAge() >= 23) {
                if (student.getGradeOfCourse() == 5) {
                    return true;
                }
            }
        }
        return false;
    }
}
