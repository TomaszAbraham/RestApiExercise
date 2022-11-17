package pl.training.restapi.services;

import pl.training.restapi.exception.DivisionByZeroException;


public enum Operation {
    ADD {
        @Override
        Double calc(Double a, Double b) {
            return a + b;
        }
    },
    SUBSTRACT {
        @Override
        Double calc(Double a, Double b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        Double calc(Double a, Double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        Double calc(Double a, Double b) {
            if(b != 0) return a / b;
            else throw new DivisionByZeroException();
        }
    };
    
    abstract Double calc(Double a, Double b);
}
