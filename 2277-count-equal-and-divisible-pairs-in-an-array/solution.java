class Solution {
    public int countPairs(int[] nums, int k) {
       return recur(nums,k,0);
    }
    public int recur(int[] nums,int k,int i){
        if(i>=nums.length){
            return 0;
        }

        int count=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j] && (i*j)%k==0){
                count++;
            }
        }
        return count+recur(nums,k,i+1);
    }
}
/*
    int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(i*j % k ==0){
                        c++;
                    }
                }
            }
        }
    return c;
*/

