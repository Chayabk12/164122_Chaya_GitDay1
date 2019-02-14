package Java8_lambda;

import java.util.ArrayList;
import java.util.List;

public class q4_lambda
{
public static void main(String[] args)
{
   List<String> list = new ArrayList <String>();
   list.add("Rachel");
   list.add("Ross");
   list.add("Monica");
   list.add("Chandler"); 
   list.add("Joey");
   list.add("pheobe");
   list.add("sneha");
   list.add("priii");
   list.removeIf(word->  (word.length()%2!=0));
   
   for (String display:list)
   {
	   System.out.println(display);
   }
}
}
