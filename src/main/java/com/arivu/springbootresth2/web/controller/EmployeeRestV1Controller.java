package com.arivu.springbootresth2.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arivu.springbootresth2.entity.Employee;
import com.arivu.springbootresth2.service.IEmployeeService;

@RestController
@RequestMapping("rest/v1/employees")
public class EmployeeRestV1Controller  {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping()
    public ResponseEntity<List<Employee>> getEmployees(){    	
    	return ResponseEntity.ok(employeeService.findAll());
    }
}
