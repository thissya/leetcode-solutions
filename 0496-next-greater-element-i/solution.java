class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int[] ans=new int[nums1.length];
        int ind=0;
        for(int i=0;i<nums1.length;i++)
        {
            int max=0;
            int f=0;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    max=nums1[i];
                    f=1;
                }
                if(f==1 && max<nums2[j])
                {
                    max=nums2[j];
                    break;
                }
            }
            ans[ind++]=max;
        }  
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]==nums1[i])
            {
                ans[i]=-1;
            }
        } 
        return ans;
    }
}
