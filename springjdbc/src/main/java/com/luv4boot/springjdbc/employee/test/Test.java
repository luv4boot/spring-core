package com.luv4boot.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv4boot.springjdbc.employee.dao.EmployeeDAO;
import com.luv4boot.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/luv4boot/springjdbc/employee/test/config.xml");
		EmployeeDAO dao = ctx.getBean("employeeDao", EmployeeDAO.class);

		// Employee employee = new Employee();
		// employee.setId(1002);
		// employee.setFirstName("Manmadha");
		// employee.setLastName("Ponnana");

		// int result = dao.create(employee);
		// int result = dao.update(employee);

		// System.out.println("No of records updated =>" + result);

		// int result = dao.delete(1002);
		// System.out.println("No of records deleted =>" + result);

		// Employee employee = dao.read(1001);
		// System.out.println("Employee Record =>{}" + employee);

		List<Employee> employees = dao.read();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		// System.out.println("List Employees =>{} " + employees);

		((AbstractApplicationContext) ctx).close();
	}

}
