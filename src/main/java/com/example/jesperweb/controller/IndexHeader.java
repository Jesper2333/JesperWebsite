package com.example.jesperweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexHeader {
    @GetMapping("/header.html")
    public String header(){
        return "header";
    }
}
