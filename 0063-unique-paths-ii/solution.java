class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return recur(0,0,n,m,dp,grid);
    }

    public int recur(int i,int j,int n,int m,int[][] dp,int[][] grid){
        if(i>=n || j>=m){
            return 0;
        }
        if(grid[i][j]==1){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j]=recur(i+1,j,n,m,dp,grid)+recur(i,j+1,n,m,dp,grid);
        return dp[i][j];

    }

}
