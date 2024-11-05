package com.rahul.spring_security.welocomeAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeAPI {
    @GetMapping("/welcome")
    public String getWelcomeApi(){
        return "Welcome Rahul";
    }
}
