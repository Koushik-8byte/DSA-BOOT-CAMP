import java.util.*;
import java.util.function.Consumer;


class Features{
    public static void main(String[] args) {
//        System.out.println("hello");
//        //External Iterations
//        // java.util.@org.jetbrains.annotations.NotNull
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
//        for (int i = 0; i < 6; i++) {
//            System.out.println(values.get(i));
//        }
//        System.out.println("After list ");
//        Iterator<Integer> i= values.iterator();
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//        }
//        System.out.println("using iterators output above ");
//        System.out.println("now enhanced for loop");
//        for( int a:values)
//        {
//            System.out.println(a);
//        }
        //Internal Iterations
   //     Consumer<Integer> c = i-> System.out.println(i);
//        {
//            public void accept(Integer i)
//            {
//                System.out.println(i);
//            }
//
//        };
  //      values.forEach(c);
     //   values.forEach(i-> System.out.println(i));
        values.forEach(System.out::println);
        System.out.println("using method references");
        values.forEach(Features::doubleit);
    }
 static void doubleit(int i)
 {
     System.out.println(i*2);
 }
}