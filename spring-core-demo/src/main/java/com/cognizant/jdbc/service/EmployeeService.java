package com.cognizant.jdbc.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.jdbc.dao.EmployeeDaoImpl;
import com.cognizant.jdbc.model.Employee;



public class EmployeeService {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	/*Employee empl=(Employee) ctx.getBean("employee");
	System.out.println(empl);*/
	EmployeeDaoImpl edao=(EmployeeDaoImpl) ctx.getBean("edao");
	//System.out.println(edao.insert(new Employee(123,"Ankana",55600.00,"FSE")));
	//System.out.println(edao.insert(new Employee(125,"Ankeeta",15600.00,"java")));
	//System.out.println(edao.insert(new Employee(155,"Angika",10200.00,"sales")));
	//System.out.println(edao.insert(new Employee(112,"Lahari",35600.50,"Management")));
	//System.out.println(edao.update(new Employee(125, "Atreyee", 55000.50, "Academy")));
	//System.out.println(edao.delete(new Employee(155,"Angika",10200.00,"sales")));
	/*List<Employee> empl=edao.getAll();
	for(Employee e:empl){
		System.out.println(e);
	}*/
}
}
