package com.project.donation.Services;

import com.project.donation.Models.User;

public interface UserService {

    boolean userExists(String email);
    String createUser(User user);

}
