package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.model.Employees;

@Repository
public class EmployeeDAO {
	
	private static Employees list = new Employees();
	
	static {
		list.getEmplist().add(new Employee("1", "amar", "amar@y.com"));
	}
	
	public Employees getAllEmployees() {
		return list;
	}
	
	public void addEmployee(Employee emp) {
		list.getEmplist().add(emp);
	}

}
