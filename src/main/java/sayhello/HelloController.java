package com.example.sayhelloapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/sayhello")
    public String sayHello(@RequestParam String myName) {
        return "Hello " + myName + "!";
    }
}
