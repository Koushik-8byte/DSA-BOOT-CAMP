import java.util.*;
class Max{
    public static void main(String[] args)
    {
        int[] arr={10,20,1000,99,9,};

        System.out.println(max(arr));
    }
    static int max(int[] arr)
    {
        int maxValue=arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>maxValue)
            {
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}