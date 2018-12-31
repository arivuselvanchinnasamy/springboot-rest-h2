package com.arivu.springbootresth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arivu.springbootresth2.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
