class Solution {
    public int ans = Integer.MAX_VALUE;
    int n,m;
    int[][] dp;
    public int minPathSum(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        dp= new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return recur(0,0,0,grid);
    }

    public int recur(int i,int j,int sum,int[][] grid){
        if(i>=n || j>=m){
            return Integer.MAX_VALUE;
        }

        if(i==n-1 && j==m-1){
            return grid[i][j];
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int first = recur(i+1,j,sum+grid[i][j],grid);
        int sec = recur(i,j+1,sum+grid[i][j],grid);
        return dp[i][j] = grid[i][j] + Math.min(first,sec);
    }

}
