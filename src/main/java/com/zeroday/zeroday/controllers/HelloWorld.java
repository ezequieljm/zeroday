package com.zeroday.zeroday.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = HelloWorld.BASIS)
public class HelloWorld {
    public static final String BASIS = "/";

    @GetMapping()
    public String helloWorld() {
        return "Hello world";
    }
}
