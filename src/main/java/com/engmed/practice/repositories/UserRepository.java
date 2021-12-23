package com.engmed.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engmed.practice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
