package com.revature.springrestapi.onetomany.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.springrestapi.onetomany.model.Assignment;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
	List<Assignment> findByStudentId(Long studentId);	
}
