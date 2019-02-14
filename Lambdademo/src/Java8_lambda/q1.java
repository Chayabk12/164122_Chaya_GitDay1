package Java8_lambda;

public class q1 
{
 public static void main(String[] args)
{
 	Operation op=(a,b)->(a+b);
 	System.out.println("addition operation"+op.operate(2,6));
 	
 	Operation sub=(a,b)->(a-b);
 	System.out.println("subtract"+sub.operate(2,6));
 	
 	Operation multiply=(a,b)->(a*b);
 	System.out.println("multiplication"+" " +multiply.operate(2,6));
 	
 	Operation div=(a,b)->
 	{
 			return a/b;
 	};
 	System.out.println("division"+" " +div.operate(12,9));
}
 

}
