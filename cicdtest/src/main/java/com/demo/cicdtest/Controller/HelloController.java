package com.demo.cicdtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        String name = "Spring";
        model.addAttribute("name", name);
        return "hello-page";
    }
}