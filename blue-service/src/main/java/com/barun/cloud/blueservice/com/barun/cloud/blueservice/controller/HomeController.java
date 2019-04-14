package com.barun.cloud.blueservice.com.barun.cloud.blueservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Blue Home";
    }
}
