package com.luv4boot.studentdal.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.luv4boot.studentdal.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	@Query("select scourse,count(scourse) from Student group by scourse")
	public List<Object[]> findScourseAndScourseCount();

}
