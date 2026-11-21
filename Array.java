import java.util.*;
class Array{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    //int[][] arr= new int[3][2];
    List<Integer> arr= Arrays.asList(1,2,3,4,5,6);
//    System.out.println("length of the arry "+arr.length);
//    System.out.println("Enter the elements of the arry:");
//    for(int row=0; row<arr.length;row++)
//    {
//        for(int col=0;col<arr[row].length;col++)
//        {
//            arr[row][col] =sc.nextInt();
//        }
//    }
   /*   for(int row=0; row<arr.length;row++)
    {
        for(int col=0;col<arr[row].length;col++)
        {
            System.out.print(arr[row][col] + " "); 
        }
        System.out.println(); 
    }*/
//   for(int[] a: arr)
//   {
//    System.out.println(Arrays.toString(a));
//   }
   arr.forEach(a-> System.out.println(a));
}
}