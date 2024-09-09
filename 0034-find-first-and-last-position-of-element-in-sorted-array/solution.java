class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int[] arr={-1,-1};
        arr[0]=findstart(nums,target);
        if(arr[0]!=-1)
        {
            arr[1]=findend(nums,target);
        }
        return arr;
    }
    public static int findstart(int[] arr,int target)
    {
        int l=0,r=arr.length-1;
        int index=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]>=target)
            {
                r=mid-1;
            }
            else{
                l=mid+1;
            }

            if(arr[mid]==target)
            {
                index=mid;
            }
        }
        return index;
    }

    public static int findend(int[] arr,int target)
    {
        int index=-1;
        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]<=target)
            {
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            if(arr[mid]==target)
            {
                index=mid;
            }
        }
        return index;
    }
}
