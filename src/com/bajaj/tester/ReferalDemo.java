package com.bajaj.tester;

import com.bajaj.dao.ReferralDao;
import com.bajaj.dao.ReferralOperations;
import com.bajaj.service.Employee;

public class ReferalDemo {

	public static void main(String[] args) {
	
		ReferralDao rd = new ReferralOperations();
		
		
		for (Employee e : rd.getAllEmployees()) {  
			System.out.println(e.getEid()+" "+ e.getEname()+" "+ e.getReferral());
    	}
		System.out.println("----------");
		
		
		Employee e = rd.getAllEmployees().get(1);  
	      e.setEname("abc");  
	      rd.updateEmployee(e); 
			System.out.println("----------");

	      
	      
	      //get the student  
	      rd.getEmployee(1);  
	      System.out.println("Employee: [ID : " + e.getEid() + ", Name : " + e.getEname() + " , Referral : " + e.getReferral() + " ]");  
//		
		
	}
}