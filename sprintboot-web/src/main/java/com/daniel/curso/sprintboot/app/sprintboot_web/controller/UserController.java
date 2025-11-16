package com.daniel.curso.sprintboot.app.sprintboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.daniel.curso.sprintboot.app.sprintboot_web.model.User;



@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Juan Daniel", "Muñoz Queupul");
        model.addAttribute("title", "Sprint Boot v3");
        model.addAttribute("user", user);
        return "details";
    }

}
