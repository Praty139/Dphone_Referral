package com.bajaj.dao;

import java.util.ArrayList;
import java.util.List;

import com.bajaj.service.Employee;

public class ReferralOperations implements ReferralDao{
	
	List<Employee> emp;
	
	 public ReferralOperations(){  
	      emp = new ArrayList<Employee>();  
	      Employee e1 = new Employee(0, "Pratyush", "abc");  
	      Employee e2 = new Employee(1, "Snehil", "qwe");  
	      emp.add(e1);  
	      emp.add(e2);         
	   }

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return emp;
	}

	@Override
	public Employee getEmployee(int eid) {
		// TODO Auto-generated method stub
		return emp.get(eid);
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		emp.get(e.getEid()).setEname(e.getEname());
		System.out.println("Data updated");
	}

//	@Override
//	public void deleteEmployee(Employee emp) {
//		// TODO Auto-generated method stub
//		
//	}  	
		
		
		

	
	
}
