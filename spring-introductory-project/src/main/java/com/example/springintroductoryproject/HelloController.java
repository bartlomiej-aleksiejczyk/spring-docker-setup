package com.example.springintroductoryproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Martyna Kocham CB :*";
    }
    private static int add(int int1, int int2)
    {
        int sum = int1 + int2;
        return sum;
    }
}
