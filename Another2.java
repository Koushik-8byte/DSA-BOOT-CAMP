//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.*;
class Another2{
    public static void main(String[] args) {
        Integer[] numbers={1,2,3,4,5,6,7,8,9,10};
        List<Integer>streamOfIntegers=new ArrayList<>(Arrays.asList(numbers));
        streamOfIntegers.stream()
                .peek(num -> System.out.println("processing the number:"+num))
                .filter(integer->{
                    System.out.println("applying the filter to the number:"+integer);
                    return integer>5;
                })
                .forEach(number-> System.out.println("forEach:printing the number"+number));

    }
}