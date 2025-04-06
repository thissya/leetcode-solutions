class Solution {
    int sum=0;
    public void dfs(int[] nums,int i,int n,int cursum){
        if(i>=n){
            sum+=cursum;
            return;
        }
        dfs(nums,i+1,n,cursum^nums[i]);
        dfs(nums,i+1,n,cursum);
    }

    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int cursum=0;
        dfs(nums,0,n,0);
        return sum;
    }
}

/*
Using Bitwise (Bitwise for generating subsets)

class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int bit=0;bit<(1<<n);bit++){
            int xor = 0;
            for(int j=0;j<n;j++){
                if((bit & (1<<j)) !=0){
                    xor^=nums[j];
                } 
            }
            sum+=xor;
        }
        return sum;
    }
}
*/
