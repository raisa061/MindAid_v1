package com.example.MindAid.repository;

import com.example.MindAid.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    @Override
    Optional<Payment> findById(Integer integer);
}
