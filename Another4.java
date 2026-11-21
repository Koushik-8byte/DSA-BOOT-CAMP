import java.util.*;
import java.util.stream.*;
//import java.util.function;
import java.util.function.UnaryOperator;
class Another4{
 public static void main(String[] args) {
     Stream.iterate(0,new UnaryOperator<Integer>()
     {
         @Override
         public Integer apply(Integer i)
         {
             return i+1;
         }
     })
             .filter(n -> n<20)
             .limit(10)
             .forEach(System.out::println);

    }
}