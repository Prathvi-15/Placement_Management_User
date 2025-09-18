package com.example.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.placement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
