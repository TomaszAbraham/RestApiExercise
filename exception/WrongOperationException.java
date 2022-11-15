package pl.training.restapi.exception;

public class WrongOperationException extends IllegalArgumentException {

    private static final long serialVersionUID = -6110036699676988156L;

    public WrongOperationException(String s) {
        super("Could not perform: " + s
            + " <br> Possible operations are only: 'add','substract', 'multiply' and 'divide'.");
    }
}
