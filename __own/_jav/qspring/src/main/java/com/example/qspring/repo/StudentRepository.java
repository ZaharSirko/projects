package com.example.qspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.qspring.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    
}
