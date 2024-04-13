package io.srabari.cabbookingapp.services;

import io.srabari.cabbookingapp.entity.User;
import io.srabari.cabbookingapp.model.SignupRequest;
import io.srabari.cabbookingapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(SignupRequest signupRequest) {
        User newUser = new User();
        newUser.setUsername(signupRequest.getUsername());
        newUser.setPassword(passwordEncoder.encode(signupRequest.getPassword()));
        newUser.setRole("ROLE_RIDER");
        return userRepository.save(newUser);
    }
}
