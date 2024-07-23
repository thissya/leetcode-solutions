class Solution {
    public boolean containsDuplicate(int[] nums) 
    {/*
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                return true;
            }
        }
        return false;
        */
        HashSet<Integer> set =new HashSet<>();
        for(int i:nums)
        {
            if(set.contains(i))
            {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
