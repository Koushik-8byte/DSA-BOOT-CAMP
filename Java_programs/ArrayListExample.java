import java.util.*;

public class ArrayListExample {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>(10);
        Scanner sc=new Scanner(System.in);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(60);
//        list.add(70);
//        list.add(60);
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(5);
        //input
        System.out.println(list);
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
       // System.out.println(list);
 //get element
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(list.get(i));
//        }
        list.forEach(i-> System.out.println(i));
    }
}
