class Solution {
    int n,m;
    public int numIslands(char[][] grid) {
        n = grid.length;
        m= grid[0].length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(i,j,grid);
                }
            }
        }
        return ans;
    }

    public void dfs(int i,int j,char[][] grid){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0' )return ;
        grid[i][j]='0';
        dfs(i+1,j,grid);
        dfs(i,j+1,grid);
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);
    }

}
