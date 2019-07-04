package com.project.donation.Controllers;

import com.project.donation.Models.User;
import com.project.donation.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserCrudController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }

    @PostMapping("/inscription")
    public boolean createUser(@RequestBody User user) {
        System.out.println(user.getEmail());
        return userService.createUser(user);
    }

    @PutMapping("/updateAccount/{idUser}")
    public boolean updateUser(@PathVariable("idUser") Long idUser, @RequestBody User user) {return userService.updateUser(idUser,user);}

    @DeleteMapping("/deleteAccount/{idUser}")
    public boolean deleteUser(@PathVariable("idUser") Long idUser) {return userService.deleteUser(idUser);}
}