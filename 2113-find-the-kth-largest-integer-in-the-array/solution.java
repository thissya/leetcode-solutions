import java.math.BigDecimal;
class Solution {
    public String kthLargestNumber(String[] nums, int k) 
    {
        BigDecimal[] nums1=new BigDecimal[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums1[i]=new BigDecimal(nums[i]);
        }    
        Arrays.sort(nums1);
        int m=1;
        BigDecimal ans=nums1[nums.length-k];
        return ans.toString();
    }
}
