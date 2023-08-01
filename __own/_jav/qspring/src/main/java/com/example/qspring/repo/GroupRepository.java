package com.example.qspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.qspring.model.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
    
}
