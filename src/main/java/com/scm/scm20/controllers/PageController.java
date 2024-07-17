package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        System.out.println("Hello Logs");
        model.addAttribute("name", "SubString Value");
        return "hello";
    }
}
