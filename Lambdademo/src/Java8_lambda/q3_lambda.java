package Java8_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate; 
import java.util.function.Supplier;
public class q3_lambda 
{ 
	    public static void main(String[] args) 
	    { 
	        Predicate<Integer> greaterThanTen = (i) -> i > 10; 
	  
	    
	        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
	        boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
	        System.out.println(result); 
	  
	     
	        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
	        System.out.println(result2); 
	        System.out.println();
	        System.out.println("customer class");        
	        Consumer<String> consumer = q3_lambda::printNames;
	        consumer.accept("C++");
	                consumer.accept("Java");
	                consumer.accept("Python");
	                consumer.accept("Ruby On Rails");
	                System.out.println();
	                System.out.println("supplier class");
	               
List<String> names = new ArrayList<String>();
     names.add("Harvey");
     names.add("rani");
     names.add("vivek");       
     names.add("saathiya");	                	            
	                        names.stream().forEach((item)-> {
	                            printNamesof(()-> item);
	                                       });

	    }
	   
	    private static void printNames(String name) {
	    	System.out.println(name);
	    }
	    	private static void printNamesof(Supplier<String> supplier) {
	    	
	    		        System.out.println(supplier.get());

	    	
	    } 
	} 

