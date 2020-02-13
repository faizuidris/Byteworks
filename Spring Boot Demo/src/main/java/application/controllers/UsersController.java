package application.controllers;

import application.models.User;
import application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserService userService;

    @PostMapping("addUser")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "User added successfully...";
    }
}