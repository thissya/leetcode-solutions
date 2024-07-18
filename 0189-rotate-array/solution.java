class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr= new int[nums.length*2];
        k=k%nums.length;
        k=nums.length-k;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        for(int i=k;i<k+nums.length;i++)
        {
            nums[i-k]=arr[i];
        }
    }
}
