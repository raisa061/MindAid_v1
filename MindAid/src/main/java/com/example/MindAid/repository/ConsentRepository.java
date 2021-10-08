package com.example.MindAid.repository;

import com.example.MindAid.model.Consent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface  ConsentRepository extends JpaRepository<Consent,Integer> {
    @Override
    Optional<Consent> findById(Integer integer);
}
