package assign_java;

public class armstrong_betwn {
	             public static void main (String [] args) 
	             { 


	                    for (int num = 100 ; num <= 1000 ; num ++) 
	                     { 
	                                int n = num; 
	                                int temp = 0; 
	                                int res = 0;

	                                while (n > 0) 
	                                 { 
	                                             temp= n % 10; 
	                                             res = res + (temp * temp * temp); 
	                                             n = n / 10; 
	                                 } 
	                                 if (num == res) 
	                                  { 
	                                             System.out.println (num); 
	                                   } 
	                      } 
	            } 
	}
	


