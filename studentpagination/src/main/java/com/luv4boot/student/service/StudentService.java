package com.luv4boot.student.service;

import org.springframework.data.domain.Page;

import com.luv4boot.student.entity.Student;

public interface StudentService {
	Page<Student> findAll(int page,int size);

	Student save(Student student);

	Student update(Student student);

	Student findById(Long id);

	void delete(Long id);
}
