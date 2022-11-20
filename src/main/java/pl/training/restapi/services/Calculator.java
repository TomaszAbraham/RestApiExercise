package pl.training.restapi.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pl.training.restapi.exception.WrongParameterException;
import pl.training.restapi.model.Result;

@Service
@RequiredArgsConstructor
public class Calculator {
        
    public Result calculate(Operations operation, String strA, String strB) {
        Double a = null;
        Double b = null;
        try {
            a = Double.parseDouble(strA);
        }catch(NumberFormatException e) {
            throw new WrongParameterException(strA);
        }
        try {
            b = Double.parseDouble(strB);
        }catch(NumberFormatException e) {
            throw new WrongParameterException(strB);
        }
        return new Result(operation.calc(a, b));
    }

}
