package com.fan.springboot.controller;


import com.fan.springboot.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;

    @GetMapping("/hello")
    public String hello(){
        return "hello springboot!!";
    }

    @GetMapping("/personConpro")
    public Person personConfigurationProperties(){
        return person;
    }

}
