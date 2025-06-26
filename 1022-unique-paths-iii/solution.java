class Solution {
    public int uniquePathsIII(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
        int avail=0;
        int r=0;
        int c=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] ==0){
                    avail++;
                }
                if(grid[i][j]==1){
                    r=i;
                    c=j;
                }
            }
        }
        return recur(r,c,avail+1,n,m,grid);
    }

    public int recur(int i,int j,int total,int n,int m,int[][] grid){
        if(i<0 || j<0 ||i>=n || j>=m || grid[i][j]==-1 || grid[i][j]==-2 ){
            return 0;
        }
        if(grid[i][j]==2){
            if(total == 0 ){
                return 1;
            }
            return 0;
        }
        grid[i][j]=-2;
        int v1=recur(i+1,j,total-1,n,m,grid)+recur(i-1,j,total-1,n,m,grid)+recur(i,j+1,total-1,n,m,grid)+recur(i,j-1,total-1,n,m,grid);
        grid[i][j]=0;
        return v1;
    }
}
