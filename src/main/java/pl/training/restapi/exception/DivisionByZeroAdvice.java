package pl.training.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DivisionByZeroAdvice {
    @ResponseBody
    @ExceptionHandler(DivisionByZeroException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public String wrongOperationHandler(DivisionByZeroException ex) {
        return ex.getMessage();
    }

}
