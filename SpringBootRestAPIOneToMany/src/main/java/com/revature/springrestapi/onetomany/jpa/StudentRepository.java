package com.revature.springrestapi.onetomany.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.springrestapi.onetomany.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}