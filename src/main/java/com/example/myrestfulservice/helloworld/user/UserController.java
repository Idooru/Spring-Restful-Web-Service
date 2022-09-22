package com.example.myrestfulservice.helloworld.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserDaoService service;

    public UserController(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public User retrieveOneUser(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/")
    public void createUser(@RequestBody User user) {
        User savedUser = service.save(user);
    }
}
