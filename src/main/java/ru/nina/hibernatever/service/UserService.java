package ru.nina.hibernatever.service;

import org.springframework.stereotype.Service;
import ru.nina.hibernatever.model.User;
import ru.nina.hibernatever.repo.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new RuntimeException("User with id " + id + " not found");
        }
    }
}
