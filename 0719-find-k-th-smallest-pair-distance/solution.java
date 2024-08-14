class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=0;
        int max=nums[n-1]-nums[0];
        while(min<max)
        {
            int mid=(min+max)/2;
            if(find(nums,mid)<k)
            {
                min=mid+1;
            }
            else 
            {
                max=mid;
            }
        }
        return min;
    }
    public int find(int[] nums,int mid)
    {
        int c=0;
        int left=0;
        int n=nums.length;
        for(int right=1;right<n;right++)
        {
            while(nums[right]-nums[left]  > mid)
            {
                left++;
            }
            c+=right-left;
        }
        return c;
    }
}
