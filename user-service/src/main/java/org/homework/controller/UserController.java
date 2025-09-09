package org.homework.controller;

import org.homework.model.User;
import org.homework.service.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Developed by ChhornSeyha
 * Date: 09/09/2025
 */

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    ResponseEntity<User> create(User req){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(req));
    }
    @PostMapping("/{id}")
    ResponseEntity<Optional<User>> getById (@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getById(id));
    }
}
