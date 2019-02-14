package Java8_lambda;

public class Greeter
{
	public void greet(MyLambda mylambda)
	{
	  mylambda.demo();
	}
public static void main(String[] args) 
{
	Greeter g=new Greeter();
  //MyLambda  Mylambda_fn= 
  
  
	g.greet(() -> System.out.println("hello world! "));
   
	MyLambda innerMyLambda = new MyLambda()
   {
	   public void demo()
	   {
		   System.out.println("hey");
	   }
   };
   strlen length=(String s)->
   {
	   System.out.println(s.length());
   };
   length.strlngth("fhgyjuj");
   innerMyLambda.demo();
}



interface strlen
{
	void strlngth(String s);
}
interface MyLambda
{
	void demo();
}
}