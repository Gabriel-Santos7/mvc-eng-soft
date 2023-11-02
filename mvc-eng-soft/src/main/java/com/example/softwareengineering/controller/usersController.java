package com.example.softwareengineering.controller;

import com.example.softwareengineering.models.users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class usersController {

    private final List<users> users = new ArrayList<>();

    usersController() {
        users.add(new users("Gabriel", "borges@gmail.com"));
        users.add(new users("Fernando", "brino@gmail.com"));
        users.add(new users("Claudio", "cludinhoBochecha@gmail.com"));
    }

    @GetMapping
    private String getUsers(Model model) {
        model.addAttribute("users", users);
        return "users";
    }
}
