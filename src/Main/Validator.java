package Main;

/**
 * Created by 7 on 19.06.2016.
 */
public interface Validator <E> {

    // Валидирует переданое значение
    boolean isValid(E result);
}