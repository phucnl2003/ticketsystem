package com.example.ticketsystem.repository;

import com.example.ticketsystem.entity.SuatChieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface SuatChieuRepository extends JpaRepository<SuatChieu, UUID> {
}
