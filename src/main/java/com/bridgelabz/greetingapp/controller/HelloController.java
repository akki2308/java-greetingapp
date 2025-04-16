package com.bridgelabz.greetingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = {"/query"},method= RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return "Hello" + name + "!";
    }
}
