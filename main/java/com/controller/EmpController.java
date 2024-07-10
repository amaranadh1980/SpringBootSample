package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.model.Employees;

@RestController
@RequestMapping("/empservice")
public class EmpController {
	
	@Autowired
	private EmployeeDAO dao;
	
	
	@GetMapping("/load")
	public Employees loadEmp(
		) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
		return dao.getAllEmployees();
	}
	
	/*
	 * {
	"name":"amar",
	"id":"aaa",
	"email" :"a@y.com"
	
		}
		post man request 
	 * 
	 * */
	
	@PostMapping("/adduser")
	public ResponseEntity<Object> addUser(@RequestBody Employee emp){
		int i = dao.getAllEmployees().getEmplist().size()+1;
		emp.setId(i+"");
		dao.addEmployee(emp);
		return ResponseEntity.ok("user added");
	}


}
