package pl.training.restapi.services;

public final class Calculator {
    private Double result;
    public Double getResult() {
        return result;
    }
    public Double calculate(String operation, Integer a, Integer b) {
        switch (operation) {
            case "add": this.result =  (double) (a + b);
            case "substract": this.result = (double) (a - b);
            case "multiply": this.result = (double) (a * b);
            case "dividet": {
                if (b != 0) this.result = (double) (a / b);
                else throw new IllegalArgumentException("Can not resolve division by zero!");
            }
        }
        return this.result;
    }


}
