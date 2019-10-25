package com.luv4boot.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.luv4boot.student.entity.Student;
import com.luv4boot.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}


	@Override
	public Page<Student> findAll(int page,int size) {
		Pageable pageable=PageRequest.of(page, size);
		Page<Student> students = studentRepository.findAll(pageable);
		return students;
	}

}
