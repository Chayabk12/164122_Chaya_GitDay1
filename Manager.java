package app;
import app.Manager;
import java.util.Scanner;

public class Manager  extends Employee
{
	double salary= 15000;

	Scanner s1= new Scanner(System.in);
	String performance= s1.next();
	
	double incentive;

	
	
	@Override
	public void bonus() 
	{
		
		if(performance.equals("Good"))
		{
		
			salary=salary +1500; 
			System.out.println(salary);
		}
		else if(performance.equals("better")) 
		{
			salary= salary+2000;	
			System.out.println(salary);
		}
		else if (performance.equals("best"))
		{
			salary=salary+2500;
			System.out.println(salary);
		}
	}

}
