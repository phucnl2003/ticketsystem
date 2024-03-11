package com.example.ticketsystem.controller;


import com.example.ticketsystem.dto.common.response.ApiResponse;
import com.example.ticketsystem.dto.user.request.UserRegisterRequest;
import com.example.ticketsystem.dto.user.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/user/v1")
public interface IUserController {
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    ResponseEntity<ApiResponse<UserResponse>> addUser(@RequestBody UserRegisterRequest request);
}
