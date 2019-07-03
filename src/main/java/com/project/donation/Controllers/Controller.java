package com.project.donation.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    @GetMapping("/names")
    public List<String> getAllUsers(){

        List<String> l=new ArrayList<>();
        l.add("jjj");
        l.add("jjj");
        l.add("jjj");
        l.add("jjj");
        return  l;
    }
}
