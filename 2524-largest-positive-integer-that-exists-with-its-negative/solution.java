class Solution {
    public int findMaxK(int[] nums) 
    {
        int mink=Integer.MIN_VALUE;
        for(int i:nums)
        {
            if(i>0 && contains(nums,-i))
            {
                mink=Math.max(mink,i);
            }
        }
        return mink!=Integer.MIN_VALUE ? mink:-1;
    }
    public boolean contains(int[] nums,int target)
    {
        for(int i:nums)
        {
            if(i==target)
            {
                return true;
            }
        }
        return false;
    }
}
