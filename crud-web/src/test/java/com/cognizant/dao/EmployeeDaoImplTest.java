package com.cognizant.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cognizant.model.Employee;

public class EmployeeDaoImplTest {
@Test
public void testCreate(){
	EmployeeDao dao=new EmployeeDaoImpl();
	String res=dao.create(new Employee(123, "Test", 25000));
	assertNotNull(res);
	assertEquals("Added Successfully", res);
	res=dao.create(new Employee(125, "Test1", 65422));
	assertNotNull(res);
	assertEquals("Added Successfully", res);
}
@ Test
public void testUpdate(){
	EmployeeDao dao=new EmployeeDaoImpl();
	String res=dao.update(new Employee(123, "Test", 35000));
	assertNotNull(res);
	assertEquals("SUCCESSFULLY UPDATED", res);
}
@Test
public void testDelete(){
	EmployeeDao dao=new EmployeeDaoImpl();
	String res=dao.delete(new Employee(125));
	assertNotNull(res);
	assertEquals("SUCCESSFULLY DELETED", res);
}

}
