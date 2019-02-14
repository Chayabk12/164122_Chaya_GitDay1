package com.chaya.database;

import java.util.HashMap;
import java.util.Map;

import com.chaya.demo.assignmnt5_rest.Employee;

public class Database_emp 
{
 private static Map<Integer, Employee> e = new HashMap();
 
 public static Map<Integer, Employee> getEmployee()
 {
	 return e;
 }
}
