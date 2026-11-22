class Search{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,-5,6,7,8,9,10};
        int target=-1;
        System.out.println(linearSearch(arr,target));
        System.out.println(linearSearch2(arr,target));
        System.out.println(linearSearch3(arr,target));



    }
    static boolean linearSearch3(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int element:arr)
        {
            if(element==target)
            {
                return true;
            }
        }
        //this line will execute if none of the return statments above have executed
        //hence the target not found
        return  false;
    }

    static int linearSearch2(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return Integer.MAX_VALUE;
        }
        for(int element:arr)
        {
            if(element==target)
            {
                return element;
            }
        }
        //this line will execute if none of the return statments above have executed
        //hence the target not found
        return Integer.MAX_VALUE;
    }
    static int linearSearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]==target)
            {
                return index;
            }
        }
        //this line will execute if none of the return statments above have executed
        //hence the target not found
            return -1;
    }

}