package pl.training.restapi.exception;

public class DivisionByZeroException extends IllegalArgumentException{

    private static final long serialVersionUID = 4420794757333850845L;

    public DivisionByZeroException() {
        super("It is impossible to divide by ZERO");
    }
}
