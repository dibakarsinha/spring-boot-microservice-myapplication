package com.gfg.employeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import  com.gfg.employeapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}