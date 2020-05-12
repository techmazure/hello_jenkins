package com.techm.Hello.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techm.Hello.entity.Employee;

public interface EmployeeDAO extends JpaRepository<Employee,Integer>{

}
