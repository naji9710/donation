package com.project.donation.Services.ServicesImpl;

import com.project.donation.Models.User;
import com.project.donation.Repositories.UserRepository;
import com.project.donation.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean userExists(String email) {

        List<User> users;
        users=userRepository.findAll();

        if(users == null) return false;

        for(User user: users) {
            if(user.getEmail().equals(email)) return true;
        }
        return false;
    }

    @Override
    public String createUser(User user) {

        if( userExists(user.getEmail()) ) return "This email address is already linked to an account !";
        userRepository.save(user);
        return "account created !";
    }
}
