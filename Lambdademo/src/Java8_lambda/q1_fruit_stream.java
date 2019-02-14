package Java8_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class q1_fruit_stream
{
	public static void main(String[] args)
	{
         List <Fruit> f1= new ArrayList();
         f1.add(new Fruit("orange", 80, 150, "orange"));
         f1.add(new Fruit("strawberry", 10, 180, "red"));
         f1.add(new Fruit("cherry", 12, 150, "red"));
         f1.add(new Fruit("kiwi", 10, 5650, "green"));
         f1.add(new Fruit("banana", 98, 50, "yellow"));
         
         
         System.out.println();
         f1.stream().filter(a->(a.getColor()=="red"))
         .sorted(Comparator.comparing(Fruit::getPrice))
         .forEach(a->System.out.println(a.getName()+ " "+a.getCalories()+" "+a.getColor()));
         System.out.println();
         
        System.out.println("sorting by color");
        System.out.println();
         f1.stream().sorted(Comparator.comparing(Fruit::getColor).reversed())
         .forEach(a->System.out.println(a.getColor()+" "+a.getName()));
         System.out.println();
         System.out.println();
         System.out.println("sorting by calories");
         System.out.println();
         
         f1.stream().filter(a->(a.getCalories()<100))
         .sorted(Comparator.comparing(Fruit::getCalories).reversed())
        .forEach(a->System.out.println(a.getName()+ " "+a.getCalories()+" "+a.getColor()+" "+ a.getPrice()));
         
       
         
	
	}
}
