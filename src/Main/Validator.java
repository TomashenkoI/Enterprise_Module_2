package Main;

/**
 * Created by 7 on 19.06.2016.
 */
public interface Validator <T> {

    // Валидирует переданое значение
    boolean isValid(T result);
}