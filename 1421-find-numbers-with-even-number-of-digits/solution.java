class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            String temp = String.valueOf(nums[i]);
            if(temp.length()%2==0){
                res++;
            }
        }   
        return res;
    }
}
