package com.example.MindAid.repository;

import com.example.MindAid.model.Therapist;
import com.example.MindAid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TherapistRepository extends JpaRepository<Therapist,Integer> {
    @Override
    Optional<Therapist> findById(Integer integer);
    @Query(value = "select * from therapist where docID= :docID", nativeQuery = true)
    public List<Therapist> findByDocID(String docID);
}
