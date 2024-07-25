class Solution {
    public int maxSubArray(int[] nums) 
    {
        int max=nums[0];
        int cur=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cur=Math.max(nums[i],cur+nums[i]);
            max=Math.max(cur,max);
        }    
        return max;
    }
}
/*
 public int maxSubArray(int[] nums) {
        int len=nums[0];
        if(nums.length==1)
        {
            return len;
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<=nums.length;j++)
            {
                int temp=find(nums,i,j);
                if(temp>len)
                {
                    len=temp;
                }
            }
        }
        return len;
    }
    public static int find(int[] nums,int s,int e)
    {
        int sum=0;
        for(int i=s;i<e;i++)
        {
            sum+=nums[i];
        }
        return sum;
    }
    */
