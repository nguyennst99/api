package com.api.lecturerscheduling.service.impl;

import com.api.lecturerscheduling.dto.UserLoginDTO;
import com.api.lecturerscheduling.mapper.UserMapper;
import com.api.lecturerscheduling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserLoginDTO login(UserLoginDTO dto){
        String username = dto.getUsername();
        String password = dto.getPassword();
        System.out.println("A: " + username);
        UserLoginDTO userLoginDTO = userMapper.loginUser(username, password);
        System.out.println("B: " + userLoginDTO);
        return userLoginDTO;
    }
}
