package mate.academy.dao;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message) {
        super(message);
    }

    public DataProcessingException(String message, Throwable ex) {
        super(message, ex);
    }
}
