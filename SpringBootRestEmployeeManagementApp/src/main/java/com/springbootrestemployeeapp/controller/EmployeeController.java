package com.springbootrestemployeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestemployeeapp.entity.Employee;
import com.springbootrestemployeeapp.service.EmployeeService;

@RestController
@RequestMapping("/employees")//class level url
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	//@RequestMapping(value="/save",method=RequestMethod.POST)
	@PostMapping("/save")//method level url
	public String saveEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
}
