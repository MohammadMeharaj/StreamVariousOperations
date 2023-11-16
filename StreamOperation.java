import java.util.*;
import java.util.stream.Collectors;

public class StreamOperation {
    public static void main(String[]args)
    {
        List<Integer>list=Arrays.asList(12,34,11,22,55,12);
        System.out.println("THE ELEMENTS IN A LIST ARE:" +list);
   
        //using filter Method

        List<Integer>Filtering=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("filter operation");
        System.out.println(Filtering);

        //using map method
         List<Integer>mapping=list.stream().map(n->n*3).collect(Collectors.toList());
         System.out.println("map operation");
         System.out.println(mapping);

         //using distinct method
         System.out.println("distinct operation");
         list.stream().distinct().forEach(System.out::println);

         //using count
         System.out.println("count operation");
         long count=list.stream().distinct().count();
         System.out.println(count);

         //using max & min
         System.out.println("max & min method");
         Optional<Integer>maximum=list.stream().max((val1,val2)->{return val1.compareTo(val2);});
         System.out.println(maximum.get());
         Optional<Integer>minimum=list.stream().min((val1,val2)->{return val1.compareTo(val2);});
         System.out.println(minimum.get());

         //using sorting
         System.out.println("Ascending and descending order");
         List<Integer>Ascending=list.stream().sorted().collect(Collectors.toList());
         System.out.println(Ascending);
         List<Integer>Descending=list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
         System.out.println(Descending);

         //limit method
         System.out.println("Limit method");
         list.stream().limit(1).forEach(System.out::println);

         //reduce method
         System.out.println("reduce method");
         Optional<Integer>reduce=list.stream().reduce((a,b)->{return (a*b);});
         System.out.println(reduce);

         //All match
         System.out.println("all match");
         boolean bool=list.stream().allMatch(n->n>10);
         System.out.println(bool);

         //anymatch
         System.out.println("any match");
         boolean ans=list.stream().anyMatch(n->n==10);
         System.out.println(ans);

         //none Match
         System.out.println("none match");
         boolean nonematch=list.stream().noneMatch(n->n<1);
         System.out.println(nonematch);

         //findany
         System.out.println("find match");
         Optional<Integer>matching=list.stream().findAny();
         System.out.println(matching);
    }
    
}
