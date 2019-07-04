package com.project.donation.Services;

import com.project.donation.Models.User;

import java.util.List;

public interface UserService {

    boolean userExists(String email);
    boolean createUser(User user);

    List<User> getUsers();

    List<User> getAllUsers();

    boolean updateUser(Long idUser, User user);
    boolean deleteUser(Long idUser);
}
