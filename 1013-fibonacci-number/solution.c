int recur(int n,int* dp){
    if(n==0 || n==1){
        return n;
    }
    if(dp[n]!=-1){
        return dp[n];
    }
    dp[n]=recur(n-1,dp)+recur(n-2,dp);
    return dp[n];
}

int fib(int n){
    int *dp=malloc(sizeof(int)*(n+1));
    for (int i = 0; i <= n; i++) {
        dp[i] = -1;
    }
    return recur(n,dp);
}
