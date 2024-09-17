package com.webcrudsecurityboot.repository;

import com.webcrudsecurityboot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}