package com.example.ticketsystem.entity;


import com.example.ticketsystem.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcType(VarcharJdbcType.class)
    private UUID id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "dob")
    private LocalDateTime dob;

    @Column(name = "inactive")
    private boolean inactive;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
}
