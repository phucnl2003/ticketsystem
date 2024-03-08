package com.example.ticketsystem.entity;


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
@Table(name = "voucher")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcType(VarcharJdbcType.class)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(name = "name")
    private String name;

    @Column(name = "expired")
    private LocalDateTime expired;

    @Column(name = "started")
    private LocalDateTime started;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "discount")
    private int discount;

    @Column(name = "used")
    private boolean used;

    @Column(name = "code")
    private String code;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;
}
