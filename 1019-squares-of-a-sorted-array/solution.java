class Solution {
    public int[] sortedSquares(int[] nums) {
        sort(nums,0);
        Arrays.sort(nums);
        return nums;
    }
    public static void sort(int[] nums,int i)
    {
        if(i<nums.length)
        {
            nums[i]*=nums[i];
            sort(nums,i+1);
        }

    }
}
/*
        for(int i=0;i<nums.length;i++)
        {
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
        */
