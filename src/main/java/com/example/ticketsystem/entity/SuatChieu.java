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
@Table(name = "suat_chieu")
public class SuatChieu {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcType(VarcharJdbcType.class)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "id")
    private Film film;

    @Column(name = "time_start")
    private LocalDateTime timeStart;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
