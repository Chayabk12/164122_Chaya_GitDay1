package Java8_lambda;

import java.util.HashMap;

public class q7_lambda 
{
	public static void main(String[] args) {
		
	
 HashMap <String, String> map= new HashMap();
map.put("chaya", "1");
map.put("priya", "2");
map.put("preeti", "3");

map.entrySet().stream().forEach(entry->(System.out.println(entry.getKey().concat(entry.getValue()))));
 
 
 
 
}

}