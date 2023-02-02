package com.bajaj.dao;

import java.util.List;

import com.bajaj.service.Employee;

public interface ReferralDao {
	
	  public List<Employee> getAllEmployees();  
	  public Employee getEmployee(int eid);  
	  public void updateEmployee(Employee e);  
//	  public void deleteEmployee(Employee e);  
}
