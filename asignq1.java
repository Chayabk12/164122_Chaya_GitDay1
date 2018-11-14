package assignmnt;

import java.util.Scanner;
import java.math.*;


public class asignq1 
{
	
	public static int count( int num1)
	{
	  int c=0;
	  while(num1!=0)
	  {
		  num1= num1/10;
		  c++;
	  }
	  return c;
	}

	public static void main(String[] args)
	{
	Scanner s1=new Scanner(System.in);
	int num= s1.nextInt();
	int a=count(num);
	int num3=num;
       
	System.out.println(a);
	int temp=0;
	double output=0;
	while(num3!=0)
	{
		temp=num3%10;
		output= (output+Math.pow(temp ,a ));
		num3=num3/10;
		
		
	}
	if(output==num)
		System.out.println("its a armstrong number");
	
	else
	System.out.println("it isnt armstrong number");
	
	}
}
	
