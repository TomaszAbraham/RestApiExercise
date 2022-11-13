package pl.training.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
    @GetMapping("/test") 
    public String getResult() {
        return "I am alive!";
        //throw new IllegalArgumentException("not implemented");
    }
    @GetMapping("/sum/{a}&{b}")
    public Integer sum(@PathVariable Integer a, @PathVariable Integer b ) {
        return a+b;
    }
}

