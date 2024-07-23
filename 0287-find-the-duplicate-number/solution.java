class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                return nums[i];
            }
        }        
        return 0;
    }
}
/*
int[] arr= new int[nums.length+1];
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
            if(arr[nums[i]]==2)
            {
                ans=nums[i];
            }
        }
        return ans;
*/

