package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        System.out.println("Hello Logs");
        model.addAttribute("name", "SubString Value");
        return "hello";
    }

    // about page
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(@RequestParam("isLoggedIn") boolean isLoggedIn, Model model) {
        model.addAttribute("isLoggedIn", isLoggedIn);
        System.out.println("About Logs");
        return "about";
    }

    // services page
    @RequestMapping("/services")
    public String services(Model model) {
        System.out.println("Services Logs");
        return "services";
    }
}
