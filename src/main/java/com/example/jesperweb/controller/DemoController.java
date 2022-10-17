package com.example.jesperweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    @GetMapping("/Demo")
    public String Demo(@RequestParam(name = "login")String login, Model Demo){
        Demo.addAttribute("login",login);
        return "Demo";
    }
}
