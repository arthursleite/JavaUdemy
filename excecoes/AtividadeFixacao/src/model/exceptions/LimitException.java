package model.exceptions;

public class LimitException extends RuntimeException {

    public LimitException(String msg) {
        super(msg);
    }
}
