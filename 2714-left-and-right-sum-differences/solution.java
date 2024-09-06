class Solution 
{
    public int[] leftRightDifference(int[] nums) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }                
        int rsum = sum;
        int lsum = 0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            rsum-=nums[i];
            arr[i]=Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return arr;
    }
}
