import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
class Features{
    public static void main() {
        Consumer<Integer> consumer = new Consumer<Integer>(){
            @Override
            public void accept(Integer obj)
            {
                System.out.println(obj);
            }
        };
        Stream<Integer> intStream=Stream.of(1,2,3,45,5,6);
        intStream.forEach(consumer);
    }
}
