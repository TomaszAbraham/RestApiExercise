package pl.training.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class WrongParameterAdvice {
    
    @ResponseBody
    @ExceptionHandler(WrongParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String wrongParameterHandler(WrongParameterException ex) {
        return ex.getMessage();
    }
}