package com.bridgelabz.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/param{name}")
    public String sayHelloParam(
            @PathVariable String name
    ) {
        return "Hello" + name + "----!";
    }

    @PostMapping("/post")
    public String sayHello(
            @RequestBody User user
    ) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + " " + user.getId();
    }
}
