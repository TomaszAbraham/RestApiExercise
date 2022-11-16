package pl.training.restapi.services;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pl.training.restapi.exception.DivisionByZeroException;
import pl.training.restapi.exception.WrongOperationException;
import pl.training.restapi.exception.WrongParameterException;
import pl.training.restapi.model.Result;

@Service
@RequiredArgsConstructor
public class Calculator {

    public Result calculate(String operation, String strA, String strB) {
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
                
        switch (operation) {
            case "add": return new Result(a + b);
            case "substract": return new Result(a - b);
            case "multiply": return new Result(a * b);
            case "divide": {
                if (b != 0) return new Result(a / b);
                else throw new DivisionByZeroException();
            }
        }
        throw new WrongOperationException(operation);
    }

}
