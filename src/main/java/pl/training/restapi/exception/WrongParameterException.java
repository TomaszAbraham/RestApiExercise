package pl.training.restapi.exception;

public class WrongParameterException extends NumberFormatException{

    private static final long serialVersionUID = -5260622273324541118L;

    public WrongParameterException(String s) {
        super("The parameter: " + s
            + " is wrong. This API can calculate only numerical parameters.");
    }
}
