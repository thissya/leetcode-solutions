class Solution {
    public int[] resultsArray(int[] nums, int k) {

        if(nums.length<k){
            return new int[0];
        }

        int res[]= new int[nums.length-k+1];

        for(int i=0;i<nums.length-k+1;i++){
            int temp=find(i,i+k,nums);
            res[i]=temp;
        }
        return res;
    }
    public static int find(int s,int e,int[] nums){
        int max=-1;
        for(int i=s;i<e-1;i++){
            if((nums[i]>=nums[i+1] )|| (nums[i+1] != nums[i]+1)){
                return -1;
            }
            max=Math.max(nums[i],max);
        }

        max=Math.max(max,nums[e-1]);
        return max;
    }
}
