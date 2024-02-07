package com.example.TalentMatchPro.controller;

import com.example.TalentMatchPro.models.User;
import com.example.TalentMatchPro.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody User user){
        String resp=userService.addUser(user);
        return new ResponseEntity(resp, HttpStatus.CREATED);

    }

    @GetMapping("/get")
    public String getUserDeatils(){
        return "Hello Guys";
    }
}
