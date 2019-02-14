package Java8_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q8_stream 
{
public static void main(String[] args) 
{
	List<Transaction> t2= new ArrayList<Transaction>();
	t2.add(new Transaction(new Trader("chaya", "hubli"), 1996, 2557));
	t2.add(new Transaction(new Trader("haya", "hubli"), 2011, 7557));
	t2.add(new Transaction(new Trader("caya", "bangalore"), 2011, 2587));
	t2.add(new Transaction(new Trader("rashmi", "patna"), 2011, 2587));
	t2.add(new Transaction(new Trader("sneha", "pune"), 2011, 2587));
	t2.add(new Transaction(new Trader("preeti", "patna"), 2011, 287));
	t2.add(new Transaction(new Trader("ashna", "Delhi"), 2013, 8687));
	t2.add(new Transaction(new Trader("ashutosh", "pune"), 2011, 3587));
	
	
t2.stream().filter(a-> a.getYear()==2011)
.sorted(Comparator.comparing(Transaction::getValue))
.forEach(a-> System.out.println( a.getValue()));

System.out.println("---------Question 9-------");

t2.stream().map(n->n.getTrader().getCity()).distinct()
.forEach(System.out::println);

System.out.println("----question 13-----");
t2.stream().filter(a-> a.getTrader().getCity().contains("Delhi"))
.forEach(a-> System.out.println(a.getValue()));

Comparator<Transaction> compare = Comparator.comparing(Transaction::getValue);
Transaction minimum_value= t2.stream().min(compare).get();
System.out.println(minimum_value);


System.out.println("-----question 14-------");
int max= t2.stream().collect(Collectors.summarizingInt(Transaction::getValue)).getMax();
System.out.println(max);

}
}
