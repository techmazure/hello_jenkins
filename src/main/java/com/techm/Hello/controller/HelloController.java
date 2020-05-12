package com.techm.Hello.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techm.Hello.DAO.EmployeeDAO;
import com.techm.Hello.entity.Employee;


@RestController
@RequestMapping("api")
public class HelloController {
	@Autowired
	EmployeeDAO employeeDAO;
@GetMapping("/hello")
public String wish()
{
	return "Hello World";
}
@GetMapping("/add/{name}")
public String addName(@PathVariable String name)
{
	return "Hello"+name;
}
@GetMapping("/employee")
public List<Employee> getEmployees()
{
	return employeeDAO.findAll();
}
@GetMapping("/find/{id}")
public Optional<Employee> getEmployee(@PathVariable int id)
{
	return employeeDAO.findById(id);
}
}
