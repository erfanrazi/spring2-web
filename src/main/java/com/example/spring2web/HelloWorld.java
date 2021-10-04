package com.example.spring2web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index() {
        System.out.println("Saying Hello Erfan...");
        return SayHello() + " " + SayErfan();
    }

    private String SayErfan() {
        return "Erfan";
    }

    private String SayHello() {
        return "Hello";
    }

}
