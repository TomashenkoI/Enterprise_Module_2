package Main;

/**
 * Created by 7 on 19.06.2016.
 */
public interface Task <T> {

    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    T getResult();


}