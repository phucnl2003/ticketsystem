package com.example.ticketsystem.dto.user.response;


import com.example.ticketsystem.entity.User;
import com.example.ticketsystem.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString public class UserResponse {
    private String id;
    private String username;
    private String email;
    private String fullname;
    private String address;
    private String phone;
    private boolean gender;
    private LocalDateTime dob;
    private boolean inactive;
    private LocalDateTime createdAt;
    private Role role;


    public UserResponse(User user) {
        this.id = user.getId().toString();
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.fullname = user.getFullname();
        this.address = user.getAddress();
        this.phone = user.getPhone();
        this.gender = user.isGender();
        this.dob = user.getDob();
        this.inactive = user.isInactive();
        this.createdAt = user.getCreatedAt();
        this.role = user.getRole();
    }
}
