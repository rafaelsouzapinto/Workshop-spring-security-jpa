package com.backend.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.springsecurity.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
