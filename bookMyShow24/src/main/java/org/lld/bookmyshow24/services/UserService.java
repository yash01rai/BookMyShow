package org.lld.bookmyshow24.services;

import org.lld.bookmyshow24.models.User;
import org.lld.bookmyshow24.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(
            String email,
            String password
    ) {
        // 1. check user if already exists
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            throw new RuntimeException("User already exists");
        }
        // 2. Create user if not
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setBookings(new ArrayList<>());
        User savedUser = userRepository.save(user);

        // 3. return user
        return savedUser;
    }
}
