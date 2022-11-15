package pl.training.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class WrongOperationAdvice {
    
    @ResponseBody
    @ExceptionHandler(WrongOperationException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String wrongOperationHandler(WrongOperationException ex) {
        return ex.getMessage();
    }
}
