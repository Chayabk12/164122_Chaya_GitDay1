package com.onkar.service;

public class TestRecord 
{
   MyDate StartDate;
   MyDate EndDate;
   int ActualDifference;

   
   public TestRecord(MyDate startDate, MyDate endDate, int actualDifference) {
	super();
	this. StartDate = startDate;
	this.EndDate = endDate;
	this.ActualDifference = actualDifference;
}


public MyDate getStartDate() {
	return StartDate;
}


public void setStartDate(MyDate startDate) {
	StartDate = startDate;
}


public MyDate getEndDate() {
	return EndDate;
}


public void setEndDate(MyDate endDate) {
	EndDate = endDate;
}


public int getActualDifference() {
	return ActualDifference;
}


public void setActualDifference(int actualDifference) {
	ActualDifference = actualDifference;
}
   
}

