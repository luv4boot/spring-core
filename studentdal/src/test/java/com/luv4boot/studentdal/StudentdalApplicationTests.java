package com.luv4boot.studentdal;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.luv4boot.studentdal.entity.Student;
import com.luv4boot.studentdal.respository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setSname("Madhav");
		student.setScourse("Java-Web-Services");
		student.setSfee(1500d);
		repository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Student student = repository.findById(1L).get();
		System.out.println(student);
	}

	@Test
	public void testUpdateStudent() {
		Student student = repository.findById(1L).get();
		student.setSfee(18000d);
		repository.save(student);
	}

	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(1L);
		repository.delete(student);
	}

	@Test
	public void testFindScourseAndScourseCount() {
		List<Object[]> count = repository.findScourseAndScourseCount();
		for (Object[] students : count) {
			System.out.println(students[0] + " - " + students[1]);
		}
	}
}
