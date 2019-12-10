package aop_advanced_examples;

/**
 * @author Evgeny Borisov
 */
public class DBException extends RuntimeException {
    public DBException(String message) {
        super(message);
    }
}
