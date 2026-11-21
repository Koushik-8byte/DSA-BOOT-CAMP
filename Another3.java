import java.util.*;
import java.util.stream.*;
class Another3{
  public static void main(String[] args) {
      Stream.of("zia","joe","rakesh","abhi")
              .filter(nameOfString ->{
                  System.out.println("Filter: applying the filter:"+nameOfString);
                  return nameOfString.length()>2;
              })
              .sorted()//String.CASE_INSENSITIVE_ORDER)
              .peek(name -> System.out.println("Sorting done for name:"+name))
              .forEach(Str ->System.out.println(Str));

    }
}