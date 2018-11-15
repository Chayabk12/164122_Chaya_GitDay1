package assignmnt;

import java.util.Scanner;

public class Student_marks_javaq9 {

	public static void main(String[] args) 
	{
		Scanner enter= new Scanner(System.in);
		
		System.out.println("Enter the marks of student 1");
		int marks11= enter.nextInt();
		int marks12= enter.nextInt();
		int marks13= enter.nextInt();
		
		System.out.println("Enter the marks of student 2");
		int marks21= enter.nextInt();
		int marks22= enter.nextInt();
		int marks23= enter.nextInt();
		
		System.out.println("Enter the marks of student 3");
		int marks31= enter.nextInt();
		int marks32= enter.nextInt();
		int marks33= enter.nextInt();
		
		
		System.out.println("Marks of student 1 is as follows");
		System.out.println("marks = "+marks11+"  "+marks12+"  "+marks13);
		System.out.println("Total score="+(marks11+marks12+marks13));
		System.out.println("Average= "+((marks11+marks12+marks13)/3));
		
		System.out.println("Marks of student 2 is as follows");
		System.out.println("marks = "+marks21+"  "+marks22+"  "+marks23);
		System.out.println("Total score="+(marks21+marks22+marks23));
		System.out.println("Average= "+((marks21+marks22+marks23)/3));
		

		System.out.println("Marks of student 1 is as follows");
		System.out.println("marks = "+marks31+"  "+marks32+"  "+marks33);
		System.out.println("Total score="+(marks31+marks32+marks33));
		System.out.println("Average= "+((marks31+marks32+marks33)/3));
		
		System.out.println("Total marks in subject A is  "+(marks11+marks21+marks31));
		System.out.println("Total marks in subject B is  "+(marks12+marks22+marks32));
		System.out.println("Total marks in subject C is  "+(marks13+marks23+marks33));
		
		System.out.println("Average in subject A is  "+((marks11+marks21+marks31)/3));
		System.out.println("Average in subject B is  "+((marks12+marks22+marks32)/3));
		System.out.println("Average in subject B is  "+((marks13+marks23+marks33)/3));

	}

}
