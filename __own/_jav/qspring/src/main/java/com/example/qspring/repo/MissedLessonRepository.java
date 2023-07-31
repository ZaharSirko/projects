package com.example.qspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.qspring.model.MissedLesson;

public interface MissedLessonRepository extends JpaRepository<MissedLesson, Integer>{
    
}
