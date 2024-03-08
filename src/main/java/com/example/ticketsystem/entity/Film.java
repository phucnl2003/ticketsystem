package com.example.ticketsystem.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcType;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcType(VarcharJdbcType.class)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "urlImage")
    private String urlImage;

    @Column(name = "urlTrailer")
    private String urlTrailer;

    @Column(name = "created-at")
    private LocalDateTime createdAt;

    @Column(name = "giaVe")
    private int giaVe;

    @OneToMany
    private List<SuatChieu> suatChieuList;
}
