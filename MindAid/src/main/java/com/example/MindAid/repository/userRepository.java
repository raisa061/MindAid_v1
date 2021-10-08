package com.example.MindAid.repository;

import com.example.MindAid.model.Consent;
import com.example.MindAid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface userRepository extends JpaRepository<User,Integer> {
    @Override
    Optional<User> findById(Integer integer);
    @Query(value = "select * from users where email= :email", nativeQuery = true)
    public List<User> findByEmail(String email);
}

