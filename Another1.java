import java.util.*;
import java.util.stream.Stream;
class Another1{
     public static void main(String[] args) {
         Stream.generate(() -> "Hello Stream:")
         .forEach(str -> System.out.println("Printing the string "+  str));

    }
}