class Solution {
    public int minPatches(int[] nums, int n) {
        int i=0,c=0;
        long reach=0;
        while(reach<n)
        {
            if(i<nums.length && nums[i]<=(reach+1))
            {
                reach+=nums[i];
                i++;
            }
            else{
                reach+=reach+1;
                c++;
            }
        }
        return c;
    }
}
