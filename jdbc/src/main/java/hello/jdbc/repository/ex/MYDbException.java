package hello.jdbc.repository.ex;

public class MYDbException extends RuntimeException {

    public MYDbException() {
    }

    public MYDbException(String message) {
        super(message);
    }

    public MYDbException(String message, Throwable cause) {
        super(message, cause);
    }

    public MYDbException(Throwable cause) {
        super(cause);
    }
}
