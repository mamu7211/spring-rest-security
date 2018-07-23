package de.seventy2eleven.springrestsecurity.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return String.format("Hello %s!", name);
    }
}
