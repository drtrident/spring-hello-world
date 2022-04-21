package com.camline.integration.sil.trials.springhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello Spring";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye Spring";
    }

    @GetMapping("/test")
    public String test() {
        return "Some Test";
    }
}
