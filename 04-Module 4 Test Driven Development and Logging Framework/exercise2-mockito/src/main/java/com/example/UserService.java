package com.example;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName(int id) {
        return userRepository.findUserById(id);
    }
}
