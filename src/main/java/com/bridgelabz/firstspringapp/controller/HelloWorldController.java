package com.bridgelabz.firstspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(value = "/home")
    public String sayHello() {
        return "Hello from Bridgelabz";
    }

    @GetMapping(value = "/query")
    public String sayHello(
            @RequestParam(value = "name") String Sunil
    ) {
        return "Hello" + Sunil + "!";
    }
}
