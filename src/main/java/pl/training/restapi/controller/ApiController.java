package pl.training.restapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pl.training.restapi.model.Result;
import pl.training.restapi.services.Calculator;
import pl.training.restapi.services.Operations;


@RestController
@RequiredArgsConstructor
public class ApiController {
    
    private final Calculator calculator; 
    
    @GetMapping("/test") 
    public String getResult() {
        return "I am alive!";
        //throw new IllegalArgumentException("not implemented");
    }
    
    @GetMapping("/calculate/{operation}")
    @ResponseBody
    public Result calculate(@PathVariable Operations operation, @RequestParam String a, @RequestParam String b ) {
        return calculator.calculate(operation, a, b);
    }  
}
