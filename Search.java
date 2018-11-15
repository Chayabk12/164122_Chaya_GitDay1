package assignmnt;

import java.util.Scanner;

public class Search 
{
 public static void main(String[] args)
 {
	 Scanner s1= new Scanner(System.in);
	// int n=s1.nextInt();
  int array[]=new int[15];
  
  for(int i=0; i<15;i++)
  {
  array[i]=s1.nextInt();
}
  System.out.println("enter element to be searched");
  int key=s1.nextInt();
  boolean re=false;
 for(int j=0; j<15; j++)
 {
	if(array[j]==key)
	{
		re=true;
		System.out.println(" key found");
		break;
	}
	
 }
 if(!re)
	 System.out.println("not");
 

 }
}