package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HsjController {
    @RequestMapping("/")
    public String main() {
        return "main";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/userOnly")
    public String userOnly() {
        return "user/userOnly";
    }
}
