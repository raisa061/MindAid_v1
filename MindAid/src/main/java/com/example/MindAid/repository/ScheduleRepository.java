package com.example.MindAid.repository;

import com.example.MindAid.model.Schedule;
import com.example.MindAid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Integer>{
    @Override
    Optional<Schedule> findById(Integer integer);
    @Query(value = "select * from schedule where dID= :dID", nativeQuery = true)
    public List<Schedule> findByDID(String dID);
    //@Query(value = "update schedule set status='booked' where slot= :slot and dID= :dID", nativeQuery = true)
   // public String UpdateStatus(String slot,String dID);



}
