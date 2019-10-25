package com.luv4boot.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv4boot.student.entity.Student;
import com.luv4boot.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping
	public Student insertStudent(@RequestBody Student student) {
		return service.save(student);
	}

	@GetMapping(params = { "page,size" })
	public Page<Student> getAllStudent(@PathVariable("page") int page, @PathVariable("size") int size) {
		return service.findAll(page, size);
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
}
