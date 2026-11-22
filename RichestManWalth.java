import java.util.*;
class RichestManWalth{
    public static void main(String[] args) {
       int[][] accounts={
               {1,2,3,},
        {1,2,6}
       } ;
        System.out.println(richestManWalth(accounts));
    }
    public static int richestManWalth(int[][] accounts)
    {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }
}
