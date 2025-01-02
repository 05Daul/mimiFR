package com.example.mimifr.rental;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//@RequestMapping("/user")
public class usersViewController {
    @GetMapping("/insert")
    public String insert(){
        return "register";
    }

    @GetMapping("/login")
    public String login(){
        return "loginForm";
    }

}
