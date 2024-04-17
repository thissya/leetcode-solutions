class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] combarr=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            combarr[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            combarr[nums1.length+i]=nums2[i];
        }
        Arrays.sort(combarr);
        int mid1,mid2,n;
        double res;
        n=combarr.length;
        if(n%2==1)
        {
            mid1=n/2;
            res=combarr[mid1];
        }
        else
        {
            mid1=(n/2)-1;
            mid2=n/2;
            res=(double)(combarr[mid1] + combarr[mid2])/2;
        }
        return res;
    }
}
