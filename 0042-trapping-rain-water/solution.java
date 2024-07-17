class Solution {
    public int trap(int[] height) 
    {
        int[] arr1= new int[height.length];
        int[] arr2= new int[height.length];
        int[] arr3= new int[height.length];
        int max=0;
        for(int i=0;i<height.length;i++)
        {
            if(max<height[i])
            {
                max=height[i];
            }
            arr1[i]=max;
        }
        max=0;
        int a=0;
        for(int i=height.length-1;i>=0;i--)
        {
            if(max<height[i])
            {
                max=height[i];
            }
            arr2[i]=max;
        }
        for(int i=0;i<height.length;i++)
        {
            arr3[i]=Math.min(arr1[i],arr2[i]);
        }
        int s1=sum(arr3);
        int s2=sum(height);
        return s1-s2;
    }
    int sum(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
