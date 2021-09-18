package com.bascis.springfundamentals.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="message", required=false, defaultValue="How are you?") String message, Model model) {
        model.addAttribute("message", message );
        return "greeting";
    }

}