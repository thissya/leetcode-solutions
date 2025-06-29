class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    ans+=4;
                    if(i<n-1 && grid[i+1][j]==1)ans-=2;
                    if(j<m-1 && grid[i][j+1]==1)ans-=2;
                }
            }
        }
        return ans;
    }
}
