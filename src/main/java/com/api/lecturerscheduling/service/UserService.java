package com.api.lecturerscheduling.service;

import com.api.lecturerscheduling.dto.UserLoginDTO;

public interface UserService {
    UserLoginDTO login(UserLoginDTO dto);
}
