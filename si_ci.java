package new_java_pro;

import java.util.Scanner;

public class si_ci {

	
	public static void main(String[] args)
	{
		Scanner Sc= new Scanner(System.in);
		float principle= Sc.nextFloat();
		float time= Sc.nextFloat();
		float rate= Sc.nextFloat();
		
		
		System.out.println("principle="+principle);
		System.out.println("Time="+time);
		System.out.println("rate="+rate);	
		System.out.println("Simple Interest  for  values  supplied is:");
		
		float simpleinterest=(principle*time*rate)/100;
		
		System.out.println(simpleinterest);
		
		float compoundinterest= (float) (principle*(Math.pow((1 + rate / 100), time))); ;
		
		System.out.println("compond interest is:"+compoundinterest);

	}


}
