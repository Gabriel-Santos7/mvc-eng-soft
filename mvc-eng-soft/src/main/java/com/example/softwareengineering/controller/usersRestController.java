package com.example.softwareengineering.controller;

import com.example.softwareengineering.models.users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class usersRestController {

    private final List<users> users = new ArrayList<>();

    usersRestController() {
        users.add(new users("Gabriel", "borges@gmail.com"));
        users.add(new users("Fernando", "brino@gmail.com"));
        users.add(new users("Claudio", "cludinhoBochecha@gmail.com"));
    }

    @GetMapping
    List<users> getUsers() {
        return users;
    }
}
