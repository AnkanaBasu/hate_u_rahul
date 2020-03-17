package com.cognizant.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cognizant.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
    private static List<Employee> list=new ArrayList<Employee>();
	public String create(Employee e) {
		// TODO Auto-generated method stub
		int count=0;
		String res=null;
		for(Employee ee:list){
			if(ee.getId()==e.getId()){
				count++;
				res="Employee already exist";
			}
		}
		if(count==0){
		list.add(e);
		res="Added Successfully";
		}
		return res;
	}

	public String update(Employee e) {
		// TODO Auto-generated method stub
		for(Employee iter:list){
			if(iter.getId()==e.getId()){
				iter.setName(e.getName());
				iter.setSalary(e.getSalary());
				return "SUCCESSFULLY UPDATED";
			}
		}
		return "Employee doesn't exist";
	}

	public String delete(Employee e) {
		// TODO Auto-generated method stub
		for(Employee iter:list){
			if(iter.getId()==e.getId()){
				list.remove(iter);
				return "SUCCESSFULLY DELETED";
			}
		}
		return "Employee doesn't exist";
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
