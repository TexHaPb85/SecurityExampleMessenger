package com.petproject.messenger.services;


import com.petproject.messenger.entities.User;
import com.petproject.messenger.exceptions.UserNotFoundException;
import com.petproject.messenger.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User addNewUser(User user){
        return userRepository.save(user);
    }

    public User editUserById(User user, Long userId){
        User thisUser = userRepository.findById(userId)
                .orElseThrow(()-> new UserNotFoundException(userId));
        user.setId(thisUser.getId());
        return userRepository.save(user);
    }

    public void deleteUser(User user){
         userRepository.delete(user);
    }


}
