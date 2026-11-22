import java.util.*;
public class OddEven{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any number:");
        int n= sc.nextInt();
        System.out.println("Is Even :"+isEven(n));
        System.out.println("Is Odd:"+isOdd(n));
    }
    public static boolean isEven(int n)
    {
        return (n&1)==0;
    }
    public static boolean isOdd(int n)
    {
        return (n&1)==1;
    }
}