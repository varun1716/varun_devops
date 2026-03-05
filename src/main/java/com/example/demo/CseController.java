package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {

    @GetMapping("/cseadd")
    public String addCSE(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        return "The value is " + sum + " and  roll number is 23MH1A05K2";
    }
}
