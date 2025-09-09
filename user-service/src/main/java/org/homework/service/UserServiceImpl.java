package org.homework.service;

import jakarta.ws.rs.NotFoundException;
import org.homework.model.User;
import org.homework.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Developed by ChhornSeyha
 * Date: 09/09/2025
 */

@Service
public class UserServiceImpl {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User create(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public User update(Long id, User user) {
        // 1. Find the existing entity in the database to get the latest version
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found with id: " + id));

        // 2. Update the fields of the managed entity
        existingUser.setUserName(user.getUserName());
        existingUser.setEmail(user.getEmail());

        // 3. Save the managed entity. This will perform an UPDATE correctly.
        return userRepository.save(existingUser);
    }

    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }
}
