package com.cognizant.jdbc.dao;

import java.util.List;

import com.cognizant.jdbc.model.Employee;

public interface EmployeeDao {
public String insert(Employee emp);
public String update(Employee emp);
public String delete(Employee emp);
public List<Employee> getAll();
}
