class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return recur(0,0,m,n,dp);
    }

    public int recur(int i,int j,int m,int n,int[][] dp){
        if( i>=m || j>=n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        dp[i][j]= recur(i+1,j,m,n,dp)+recur(i,j+1,m,n,dp);
        return dp[i][j];
    }

}
