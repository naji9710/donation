package com.project.donation.Controllers;

import com.project.donation.Models.User;
import com.project.donation.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<String> getAllUsers(){

        List<String> l=new ArrayList<>();
        l.add("jjj");
        l.add("jjj");
        l.add("jjj");
        l.add("jjj");
        return  l;
    }

    @PostMapping("/inscription")
    public String createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
