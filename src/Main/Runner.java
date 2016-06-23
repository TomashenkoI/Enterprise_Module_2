package Main;

/**
 * Created by 7 on 19.06.2016.
 */
public class Runner {
    public static ValidatorImpl validator = new ValidatorImpl();
    public static StudentCheckerImplExecutor studentChecker = new StudentCheckerImplExecutor();
    public static TaskImpl task = new TaskImpl();


    public static void main(String[] args) {

        studentChecker.addTask(task);
        studentChecker.execute(task, validator);

        System.out.println("Approriate srudent for military call: " );
        for (int i = 0; i < studentChecker.getValidResults().size(); i++) {
            System.out.println(studentChecker.getValidResults().get(i));
        }

        System.out.println("Other students: " );
        for (int i = 0; i < studentChecker.getInvalidResults().size(); i++) {
            System.out.println(studentChecker.getInvalidResults().get(i));
        }

    }
}

