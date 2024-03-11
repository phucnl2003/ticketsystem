package com.example.ticketsystem.controller.impl;


import com.example.ticketsystem.controller.IUserController;
import com.example.ticketsystem.dto.common.response.ApiResponse;
import com.example.ticketsystem.dto.user.request.UserRegisterRequest;
import com.example.ticketsystem.dto.user.response.UserResponse;
import com.example.ticketsystem.entity.User;
import com.example.ticketsystem.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController implements IUserController {
    @Autowired
    private UserService service;
    @Override
    public ResponseEntity<ApiResponse<UserResponse>> addUser(UserRegisterRequest request) {

        log.info("Has a request to register with data : {}", request.toString());
        ApiResponse<UserResponse> response = service.registerUser(request);
        log.info("Response to register with data : {}", request.toString());
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
