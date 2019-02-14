package Java8_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class q4_stream 
{
public static void main(String[] args) 
{
	List<News> l1=new ArrayList();
    l1.add(new News(1,"rashmi", "chaya", "hilarious budget"));
    l1.add(new News(2,"chaya", "ashutosh", "amaging"));
    l1.add(new News(2,"chaya", "sneha", "cool budget"));
    
    l1.add(new News(3,"aishwarya", "ashutosh", " budget amaging"));
    l1.add(new News(4,"preeti", "ashutosh", " budget amaging"));
   
    
    //////question number 7//////

    Map<String,Long> res=l1.stream()
            .map(n-> n.getCommentByUser())
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       System.out.println("-------question  5-------");
System.out.println(l1.stream()
         .filter(n->n.getComment().contains("budget"))
         .count());


System.out.println(l1.stream().max(Comparator.comparing(News::getCommentByUser)).get().commentByUser);

//News max = l1.stream()
//.collect(Collectors.maxBy(
//Comparator.comparing(News::getNewsId)))
//.get();
          
System.out.println("-------question 7--------");   
System.out.println(res);

//System.out.println(max);


}
}
