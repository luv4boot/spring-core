package com.luv4boot.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv4boot.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	

}
