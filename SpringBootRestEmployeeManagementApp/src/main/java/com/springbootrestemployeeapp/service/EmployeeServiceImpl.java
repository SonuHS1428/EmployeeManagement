package com.springbootrestemployeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestemployeeapp.entity.Employee;
import com.springbootrestemployeeapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository repository;
	
	@Override
	public String addEmployee(Employee employee) {
		Employee emp= repository.save(employee);
		if(emp!=null)
			return "Employee Saved Successfully";
		else
			return "Failed To Save Employee";
	}

}
