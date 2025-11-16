package com.daniel.curso.sprintboot.app.sprintboot_web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.curso.sprintboot.app.sprintboot_web.model.User;



@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    @ResponseBody
    public Map<String,Object> details() {
        User user = new User("Juan Daniel", "Muñoz Queupul");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Sprint Boot v3");
        body.put("user", user);
        return body;
    }

}
