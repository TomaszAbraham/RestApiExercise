package pl.training.restapi.services;

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
                else throw new IllegalArgumentException("Can not resolve division by zero!");
            }
        }
        throw new IllegalArgumentException("error");
    }


}
