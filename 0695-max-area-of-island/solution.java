class Solution {
    private int n,m;
    public int maxAreaOfIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                    ans=Math.max(ans,traverse(i,j,grid));
                }
            }
        }
        return ans;
    }
    private int traverse(int i,int j,int[][] grid){
        if(i<0 || j<0 || j>=m || i>=n || grid[i][j]<1)return 0;
        grid[i][j]=0;
        return 1+traverse(i-1,j,grid)+traverse(i,j-1,grid)+traverse(i+1,j,grid)+traverse(i,j+1,grid);
    } 
}
