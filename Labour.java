package app;

import java.util.Scanner;

public class Labour extends Employee
{
	double labour_salary=9000;
	Scanner read = new Scanner(System.in);
	int overtime= read.nextInt();
	
	@Override
public void bonus() 
{ 	
	if(overtime==1)
	{
		labour_salary=labour_salary+1000;
		System.out.println(labour_salary);
	}
	else if(overtime ==2)
	{
		labour_salary=labour_salary+1500;
		System.out.println(labour_salary);
	}
	else if(overtime==3 )
	{
		labour_salary=labour_salary+2000;
		System.out.println(labour_salary);
	}
	else if(overtime==0)
	{
		labour_salary=labour_salary;
		System.out.println(labour_salary);
	}
     
   }
}
