package app;

import java.util.Scanner;

public class Formain 
{
public static void main(String[] args)
     {          
	 			String  designation1;
	 			System.out.println("enter the designation");
	           Scanner input = new Scanner(System.in);
	         designation1= input.next();
	         
	        if(designation1.equals("Manager"))  
	        {
	        	System.out.println("Enter the performance");
	          Manager m1= new Manager();
	          m1.bonus();
	        }
	        else
	        {
	          Scanner input2 = new Scanner(System.in);
	          System.out.println("For labours info enter the hours of overtime");
	          String Designation2= input2.next();
	        	 Labour l1= new Labour();
	        	 l1.bonus();
	        }
	        }

  }

