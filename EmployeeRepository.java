package com.tnsif.ShoppingManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.ShoppingManagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
