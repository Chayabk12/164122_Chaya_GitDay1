package Java8_lambda;

import java.util.ArrayList;
import java.util.List;

public class q6_lambda
{
 public static void main(String[] args)
 {
List <String> list= new ArrayList();
list.add("chaya");
list.add("suchi");
list.add("maya");
list.add("priya");

list.stream().forEach(a->System.out.println( (a.replaceAll(a, a.toUpperCase()))));

}
}
