package com.luv4boot.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.luv4boot.springjdbc.employee.dao.EmployeeDAO;
import com.luv4boot.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.luv4boot.springjdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = template.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstName=?,lastName=? where id=?";
		int result = template.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = template.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select *from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = template.queryForObject(sql, rowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql = "select *from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> employees = template.query(sql, rowMapper);
		return employees;
	}

}
