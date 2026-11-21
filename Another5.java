import java.util.stream.*;
import java.util.*;
class Another5{
    static void main(String[] args) {
      //  Stream.of(1,2,3,4,5)
              //  .sorted(Comparator.reverseOrder())
                //.forEach(num -> System.out.println(num));
Stream.iterate(0,i->i+1)
        .limit(20)
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);
    }
}