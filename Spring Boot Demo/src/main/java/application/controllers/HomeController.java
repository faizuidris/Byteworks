package application.controllers;


import application.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("")
    public String home() {
        return "Welcome to Byteworks Food Vendor";
    }
}
