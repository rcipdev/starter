package com.example.starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/hello")
    String Hello(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age) {
        return "Hello to world " + name + " " + age;
    }
}
