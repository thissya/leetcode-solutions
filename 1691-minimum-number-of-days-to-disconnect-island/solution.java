class Solution 
{
    public int minDays(int[][] grid) 
    {
        if(countNumIsland(grid)!=1)
        {
            return 0;
        }    

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {    
                    grid[i][j]=0;
                    if(countNumIsland(grid)!=1)
                    {
                        return 1;
                    }
                    grid[i][j]=1;
                }
            }
        }
        return 2;
    }

    public int countNumIsland(int[][] grid)
    {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(!vis[i][j] && grid[i][j]==1)
                {
                    ans++;
                    dfs(grid,i,j,vis);
                }
            }
        }
        return ans;
    }
    void dfs(int[][] grid,int i,int j,boolean[][] vis)
    {
        vis[i][j]=true;
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        for(int[] d:dir)
        {
            int nrow=i+d[0];
            int ncol=j+d[1];
            if(nrow>=0 && ncol>=0 && ncol<grid[0].length && nrow<grid.length && grid[nrow][ncol]==1 && !vis[nrow][ncol])
            {
                dfs(grid,nrow,ncol,vis);
            }
        }
    }
}
