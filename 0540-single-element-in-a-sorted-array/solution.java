class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        List<Integer> res= new ArrayList<>();
        for(int num:nums)
        {
            if(res.contains(num))
            {
                res.remove((Integer)num);
            }
            else{
                res.add(num);
            }
        }
        return res.get(0);
    }
}
/*
int[] arr= new int[100000];
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(arr[nums[i]] ==1)
            {
                ans=nums[i];
                break;
            }
        }
        return ans;

*/
