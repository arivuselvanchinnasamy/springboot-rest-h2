package com.arivu.springbootresth2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arivu.springbootresth2.entity.Employee;
import com.arivu.springbootresth2.repository.IEmployeeRepository;
import com.arivu.springbootresth2.service.IEmployeeService;

@Service(EmployeeServiceImpl.BEAN_NAME)
public class EmployeeServiceImpl implements IEmployeeService {

	public static final String BEAN_NAME="employeeService";
	
	@Autowired
	private IEmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
}
