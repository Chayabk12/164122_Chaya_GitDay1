package Java8_lambda;


import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class q5_lambda 
{
 public static void main(String[] args) 
 {
	 StringBuilder sbf = new 
             StringBuilder(); 
	Consumer<List<String>>
	print= list->list.stream().forEach(a-> (sbf.append(a.charAt(0))));

	List<String> list = new ArrayList();
	list.add("Chaya");
	list.add("Pallavi");
	list.add("Raj");
	list.add("Anju");
	list.add("Sugandhini");
	
	print.accept(list);
	 System.out.println(sbf);
	  
 }
}
