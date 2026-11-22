class Another1{
    public static void main(String[] args) {
        int count;
        int[] nums = {12, 244, 39, 1, 4, 778908};
        System.out.println(findNumberOfEvenDigits(nums));
    }
    static int findNumberOfEvenDigits(int[] nums)
    { int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }

        }
        return count;

    }
    static boolean even(int num)
    {
        if(digitsOf(num)%2==0)
        {
            return true;
        }
        else
        {
        return false ;
        }
    }
    static int digitsOf(int num){
       // return (int)Math.log10(num)+1;
        int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
        return count;
    }
}