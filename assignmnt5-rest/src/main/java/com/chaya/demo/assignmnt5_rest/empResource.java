package com.chaya.demo.assignmnt5_rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class empResource 
{

	  private static final Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
	  
	   	        static {
	   	        	initEmps();
	   		   	 
	   	        }
	    
	 
	    private static void initEmps() {
	        Employee emp1 = new Employee("chaya", 1, "manager", "research", 200000);
	        Employee emp2 = new Employee("rashmi", 2, "manager", "research", 30000);
	        empMap.put(emp1.getEmpid(), emp1);
	        empMap.put(emp2.getEmpid(), emp2);
	       
	    }
	    
	    
	    
	    public static Employee getEmployee(int empid) {
	        return empMap.get(empid);
	    }
	 
	    public static Employee addEmployee(Employee emp) {
	        empMap.put(emp.getEmpid(), emp);
	        return emp;
	    }   
	 
	    public static List<Employee> getAllEmployees() 
	    
	    {
	    	
	        Collection<Employee> c = empMap.values();
	        List<Employee> list = new ArrayList<Employee>();
	        list.addAll(c);
	        return list;
	    }
	     
	    List<Employee> list;
	 
	}