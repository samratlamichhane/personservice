package com.exercise.one.homepage.controller;

import com.exercise.one.homepage.service.PersonIml;
import com.exercise.one.homepage.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class PersonController {

private PersonService personService;

    @GetMapping("/hello")
    public String hello(){
//        PersonIml any = new PersonIml();
        String response= personService.name();
        return response;
    }

    @GetMapping("/namaste/{a}")
    public String namaste(@PathVariable() String a){
        System.out.println(a);
        return a;
    }
}
