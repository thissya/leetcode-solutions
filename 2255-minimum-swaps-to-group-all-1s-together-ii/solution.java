class Solution 
{
    public int minSwaps(int[] nums) 
    {
        int n=nums.length;
        int w=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)w++;
        }       
        int[] arr= new int[n*2];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }
        int ans;
        int i=0;
        int c=0;
        for(i=0;i<w;i++)
        {
           if(arr[i]==0)
           {
                c++;
           }
        }
        ans=c;
        int k=0;
        while(i<n*2 && ans!=0)
        {
            if(arr[i]==0)
            {
                c++;
            }
            if(arr[k++]==0)
            {
                c--;
            }
            i++;
            ans=Math.min(ans,c);
        }
        return ans;
    }
}
