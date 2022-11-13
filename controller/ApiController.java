package pl.training.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pl.training.restapi.services.Calculator;

@RestController
public class ApiController {
    @GetMapping("/test") 
    public String getResult() {
        return "I am alive!";
        //throw new IllegalArgumentException("not implemented");
    }
    @GetMapping("/calculate/{operation}")
    @ResponseBody
    public String calculate(@PathVariable String operation, @RequestParam Integer a, @RequestParam Integer b ) {
        return "Result: " + Calculator.calculate(operation, a, b).toString();
    }   
}
