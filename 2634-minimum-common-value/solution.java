class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0,ans=-1;
        while(i<n && j<m)
        {
            if(nums1[i]==nums2[j])
            {
                ans=nums1[i];
                break;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
        }
        return ans;
    }
}
