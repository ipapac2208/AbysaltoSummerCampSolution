package com.example.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.user;

public interface UserRepository extends JpaRepository<user, Integer> {
    
}
