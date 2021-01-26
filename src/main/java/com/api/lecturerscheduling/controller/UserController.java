package com.api.lecturerscheduling.controller;

import com.api.lecturerscheduling.dto.UserLoginDTO;
import com.api.lecturerscheduling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public UserLoginDTO login(@RequestBody UserLoginDTO dto) {
        return userService.login(dto);
    }
}
