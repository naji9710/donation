package com.project.donation.Services;

import com.project.donation.Models.User;

import java.util.List;

public interface UserService {

    boolean userExists(String email);
    String createUser(User user);

    List<User> getUsers();
}
