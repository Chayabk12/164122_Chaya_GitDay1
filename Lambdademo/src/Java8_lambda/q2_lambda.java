package Java8_lambda;

public class q2_lambda 
{

public static void main(String[] args)
 {
order o1=(price)->
{
	if(price<10000)
	{
		System.out.println("Order rejected");
	}
	else
	{
		System.out.println("The order has been ACCEPTED");
	}
};

o1.ordering(15000);
 }
}
