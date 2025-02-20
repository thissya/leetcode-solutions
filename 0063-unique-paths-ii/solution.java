class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] arr = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    arr[i][j]=0;
                }else if(grid[i-1][j-1]==1){
                    arr[i][j]=0;
                }else if(i==1 && j==1 ){
                    arr[i][j]=1;
                }else{
                    arr[i][j] = arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        return arr[m][n];
    }
}
