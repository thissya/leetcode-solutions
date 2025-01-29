int recur(int i,int j,int *n,int m,int** dp,int** grid){
    if(i>=m || j>=*n){
        return INT_MAX;
    }
    if(i==m-1 && j==*n-1){
        return grid[i][j];
    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    return dp[i][j]=grid[i][j]+fmin(recur(i+1,j,n,m,dp,grid),recur(i,j+1,n,m,dp,grid));
}
int minPathSum(int** grid, int m, int* n) {
    int **dp = (int **)malloc(sizeof(int *)*m);
    for(int i=0;i<m;i++){
        dp[i]=(int *)malloc(sizeof(int)* *n);
        for(int j=0;j<*n;j++){
            dp[i][j]=-1;
        }
    }
    return recur(0,0,n,m,dp,grid);
}
