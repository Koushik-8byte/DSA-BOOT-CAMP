class RemoveDuplicates{
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,4};
        int rd=removeDuplicates(nums);
        System.out.println(rd);

    }
    public static int removeDuplicates(int[] nums)
    {
        int rd=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[rd]!=nums[i])
            {
                rd++;
                nums[rd]=nums[i];

            }
        }return rd+1;
    }
}