class Solution {
    int n,m;
    public int findMaxFish(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        boolean[][] visit = new boolean[n][m];
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0 && visit[i][j]==false ){
                    ans = Math.max(ans,dfs(i,j,grid,visit));
                }
            }
        }
        return ans;
    }
    public int dfs(int i,int j,int[][] grid,boolean[][] visit){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0 || visit[i][j] ){
            return 0;
        }
        visit[i][j]=true;
        return grid[i][j] + dfs(i+1,j,grid,visit)+dfs(i-1,j,grid,visit)+dfs(i,j+1,grid,visit)+dfs(i,j-1,grid,visit);

    }

}
