package com.onkar.service;

public class TestDateDifferenceProvider
{
  public static void main(String[] args)
  {
	  DateDifferenceProvider date=new DateDifferenceProvider();
	TestRecord[] TestRecord=new TestRecord[3];
	TestRecord[0]=new TestRecord(new MyDate (20,11,2018), new MyDate (20,11,2018),0); 
	TestRecord[1]= new TestRecord(new MyDate (6,4,2011), new MyDate (18,4,2011), 12);
	TestRecord[2]= new TestRecord(new MyDate (6, 4, 2011), new MyDate (18,5,2011), 42);
			
			for( int index=0; index<TestRecord.length; index++ )
			{
				long calculateDifference=date.getDateDifference(TestRecord[index].getStartDate(), TestRecord[index].getEndDate());
				
				if(TestRecord[index].getActualDifference()==calculateDifference)
				{
					System.out.println("test passed");
				}
				else
				{
					System.err.println("test failed");
				}
			}
  }
}
