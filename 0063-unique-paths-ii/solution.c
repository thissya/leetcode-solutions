int recur(int i,int j,int m,int *n,int **grid,int **dp){
    if(i>=m || j>= *n){
        return 0;
    }
    if(grid[i][j]==1){
        return 0;
    }
    if(i==m-1 && j==*n-1){
        return 1;
    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    return dp[i][j]=recur(i+1,j,m,n,grid,dp)+recur(i,j+1,m,n,grid,dp);
}
int uniquePathsWithObstacles(int** grid, int m, int* n) {
    int **dp=(int **)malloc(sizeof(int *)*m);
    for(int i=0;i<m;i++){
        dp[i]=(int *)malloc(sizeof(int)* *n);
        for(int j=0;j< *n;j++){
            dp[i][j]=-1;
        }
    }
    return recur(0,0,m,n,grid,dp);
}
