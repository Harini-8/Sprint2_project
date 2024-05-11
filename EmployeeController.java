package com.tnsif.ShoppingManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.ShoppingManagement.entity.Employee;
import com.tnsif.ShoppingManagement.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository repo;

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) {
		return repo.save(e);

	}

	@GetMapping("/employee")
	public List<Employee> getEmployees()

	{

		return repo.findAll();
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(Integer id) {
		return repo.findById(id).get();
		
	}
	public void updateEmployee(@PathVariable Integer id,@RequestBody Employee e)
	{
		e.setId(id);
		repo.save(e);
		
	}
 }