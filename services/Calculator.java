package pl.training.restapi.services;

import pl.training.restapi.exception.DivisionByZeroException;
import pl.training.restapi.exception.WrongOperationException;

public final class Calculator {
    private final Double result;
    
    public Calculator(String operation, Integer a, Integer b) {
        this.result = this.calculate(operation, a, b);
    }
    public Double getResult() {
        return result;
    }  
    private Double calculate(String operation, Integer a, Integer b) {
        switch (operation) {
            case "add": return (double) (a + b);
            case "substract": return (double) (a - b);
            case "multiply": return (double) (a * b);
            case "divide": {
                if (b != 0) return (double) ((double)a / (double)b);
                else throw new DivisionByZeroException();
            }
        }
        throw new WrongOperationException(operation);
    }


}
