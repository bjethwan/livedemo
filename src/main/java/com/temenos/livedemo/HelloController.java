package com.temenos.livedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Dear Temenosiansssssssssssssss, Greetings from Spring Boot and Bipin Jethwani!";
    }
}