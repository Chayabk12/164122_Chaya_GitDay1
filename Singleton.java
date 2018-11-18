package app;

public class Singleton 
{


private static  String getname;
 private Singleton()
 {
	 this.getname=getname;
 }
 private static Singleton bottle= null;

 public static Singleton getInstance()
 {
	 if(bottle==null)
	 {
		 bottle=new Singleton();
	 }
	 return bottle;
 }
}
