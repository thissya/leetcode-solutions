class Solution {
    int n,m;
    public int numIslands(char[][] grid) {
        int ans=0;
        n=grid.length;
        m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    traverse(i,j,grid);
                }
            }
        }
        return ans;
    }
    public void traverse(int i,int j,char[][] grid){
        if(i<0 || j<0 || j>=m || i>=n || grid[i][j]=='0')return ;
        grid[i][j]='0';
        traverse(i-1,j,grid);
        traverse(i,j-1,grid);
        traverse(i+1,j,grid);
        traverse(i,j+1,grid);
    }
}
