package com.example.ticketsystem.repository;

import com.example.ticketsystem.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface VoucherRepository extends JpaRepository<Voucher, UUID> {
}
