class Solution {
    public int recur(int i,int[] cost,int[] dp){
        if(i==0 || i==1){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=Math.min(cost[i-1]+recur(i-1,cost,dp),cost[i-2]+recur(i-2,cost,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp= new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return recur(n,cost,dp);
    }
}
