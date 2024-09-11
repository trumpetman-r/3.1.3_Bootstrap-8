package com.webcrudsecurityboot.repository;

import com.webcrudsecurityboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    Optional<User> findUserById(Long id);
}