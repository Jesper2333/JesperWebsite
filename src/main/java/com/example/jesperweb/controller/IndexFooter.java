package com.example.jesperweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexFooter {
    @GetMapping("/footer.html")
    public String footer(){
        return "footer";
    }
}
