package com.chaya.demo.assignmnt5_rest;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement

public class Employee 
{
String empname;
int empid;
String empdept;
String empdesc;
double empsal;

public Employee(String empname, int empid, String empdept, String empdesc, double empsal) {
	super();
	this.empname = empname;
	this.empid = empid;
	this.empdept = empdept;
	this.empdesc = empdesc;
	this.empsal = empsal;
}


public Employee() 
{
	
}


public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpdept() {
	return empdept;
}
public void setEmpdept(String empdept) {
	this.empdept = empdept;
}
public String getEmpdesc() {
	return empdesc;
}
public void setEmpdesc(String empdesc) {
	this.empdesc = empdesc;
}
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.empsal = empsal;
}

}
