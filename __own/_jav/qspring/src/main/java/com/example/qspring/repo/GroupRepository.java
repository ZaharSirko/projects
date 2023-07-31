package com.example.qspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.qspring.model.Group;

public interface GroupRepository extends JpaRepository<Group, Integer> {
    
}
