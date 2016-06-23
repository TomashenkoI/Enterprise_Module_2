//package Main;
//
///**
// * Created by 7 on 19.06.2016.
// */
//public class Example {
//    public void test(List<Task<Integer>> intTasks) {
//        Executor<Number> numberExecutor = new StudentCheckerImplExecutor<>();
//
//        for (Task<Integer> intTask : intTasks) {
//            numberExecutor.addTask(intTask);
//        }
//        numberExecutor.addTask(new LongTask(10L), new NumberValidator());
//
//        numberExecutor.execute();
//
//        System.out.println("Valid results:");
//        for (Number number : numberExecutor.getValidResults()) {
//            System.out.println(number);
//        }
//        System.out.println("Invalid results:");
//        for (Number number : numberExecutor.getInvalidResults()) {
//            System.out.println(number);
//        }
//    }
//}
