class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int n=nums.length;
        int[] arr1=new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr1[i]=nums[i];
        }
        int s=0;
        arr1[n]=target;
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==target)
            {
                s=i;
                break;
            }
        }
        return s;
    }
}
