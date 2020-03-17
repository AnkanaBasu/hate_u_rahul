package com.cognizant.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cognizant.jdbc.model.Employee;


public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String insert(Employee emp) {
		int r=this.jdbcTemplate.update(
		        "insert into employee(id, name, salary, department) values (?, ?, ?, ?)",
		        emp.getId(),emp.getName(),emp.getSalary(),emp.getDepartment());
		if(r>0){
			return "SUCCESS";
		}
		else{
		    return "FAILURE";
		}
	}

	public String update(Employee emp) {
		int empid=emp.getId();
		int r=this.jdbcTemplate.update(
		        "update employee set name = ?,salary=?,department=? where id = ?",
		        emp.getName(), emp.getSalary(),emp.getDepartment(),empid);
		if(r>0){
			return "SUCCESS";
		}
		else{
		return "FAILURE";
		}
	}

	public String delete(Employee emp) {
		int id=emp.getId();
		int r=this.jdbcTemplate.update(
		        "delete from employee where id = ?",
		        id);
		if(r>0){
			return "SUCCESS";
		}
		else
			return "FAILURE";
	}

	public List<Employee> getAll() {
		List<Employee> employee = this.jdbcTemplate.query(
		        "select * from employee",
		        new RowMapper<Employee>() {
		            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		                Employee emp = new Employee();
		                emp.setId(rs.getInt("id"));
		                emp.setName(rs.getString("name"));
		                emp.setSalary(rs.getDouble("salary"));
		                emp.setDepartment(rs.getString("department"));
		                return emp;
		            }
		        });
		return employee;
	}

}
