package com.rest.springbasicapi.service;

import com.rest.springbasicapi.model.User;
import com.rest.springbasicapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUserById(Long id , User user) {

        User user1 = userRepository.findById(id).orElseThrow();

        user1.setName(user.getName());
        user1.setSurname(user.getSurname());
        user1.setPhone(user.getPhone());

        return userRepository.save(user1);

    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
