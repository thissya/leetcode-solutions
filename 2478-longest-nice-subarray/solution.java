class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int cur = nums[i];
            for(int j=i+1;j<n;j++){
                if((cur&nums[j])==0){
                    cur|=nums[j];
                    max=Math.max(max,j-i+1);
                }else{
                    break;
                }
            }
        }
        return max;
    }
}

/*
     public boolean findBite(int s,int e,int[] nums){
        for(int i=s;i<e;i++){
            for(int j=i+1;j<=e;j++){
                if((nums[i] & nums[j])!=0){
                    return false;
                }        
            }
        }
        return true;
    }
    public int longestNiceSubarray(int[] nums) {
        int res = 0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                if(res>(j-i+1)){
                    continue;
                }
                if(findBite(i,j,nums)){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;

    }
*/
