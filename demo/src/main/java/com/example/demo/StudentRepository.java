package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository provides methods like save(), findAll(), count(), etc.
    // No need to implement anything - Spring Data JPA handles it automatically
}