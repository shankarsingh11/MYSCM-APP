package com.myscm.myscmapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    // home route
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");

        // sending data to view

        model.addAttribute("name", "SubString Technology");
        model.addAttribute("youtubechannel", "code with shankar");
        model.addAttribute("githubrepo", "https://github.com/shankarsingh11");
        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("about page is loading...");
        return "about";
    }

    // services route

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading...");
        return "services";
    }

    // contact route
    @RequestMapping("/contact")
    public String contactPage() {
        System.out.println("contact page loading...");
        return "contact";
    }

    // Signup route
    @RequestMapping("/signup")
    public String signupPage() {
        System.out.println("signup page loading...");
        return "signup";
    }

    // Login route
    @RequestMapping("/login")
    public String loginPage() {
        System.out.println("login page loading...");
        return "login";
    }

}
