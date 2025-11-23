package Class7.exceptions;

public class NotCorrectPasswordException extends RuntimeException{
    public NotCorrectPasswordException(String message) {
        super(message);
    }
}
