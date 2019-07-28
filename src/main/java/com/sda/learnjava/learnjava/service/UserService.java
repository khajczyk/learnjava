package com.sda.learnjava.learnjava.service;

import com.sda.learnjava.learnjava.dto.RegisterUserDTO;
import com.sda.learnjava.learnjava.model.User;
import com.sda.learnjava.learnjava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveUserToRepository(User user){
        userRepository.save(user);
    }


    public User mapRegisterDtoToUser(RegisterUserDTO registerUserDTO){
        return new User(registerUserDTO.getNickName(), registerUserDTO.getFirstName(),
                registerUserDTO.getLastName(),passwordEncoder.encode(registerUserDTO.getPassword()),
                registerUserDTO.getEmail());
    }
}
