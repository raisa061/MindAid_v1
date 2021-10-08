package com.example.MindAid.repository;

import com.example.MindAid.model.Schedule;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.Optional;


@Repository
public interface UpdateScheduleRepository extends JpaRepository<Schedule,Integer> {
    @Override
    Optional<Schedule> findById(Integer integer);
    @Modifying
    @Transactional
    @Query(value = "update schedule set status='booked' where slot= :slot and dID= :dID", nativeQuery = true)
    public int UpdateStatus(String slot,String dID);
}
