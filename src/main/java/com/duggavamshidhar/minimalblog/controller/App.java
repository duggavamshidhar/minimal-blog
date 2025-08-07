package com.duggavamshidhar.minimalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class App {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Minimal Blog");
        return "index";
    }

}
