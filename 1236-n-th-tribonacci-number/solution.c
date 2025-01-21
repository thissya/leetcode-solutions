int recur(int n,int *dp){
    if(n==1 ||n==0){
        return n;
    }else if(n==2)return 1;
    if(dp[n]!=-1){
        return dp[n];
    }
    return dp[n]=recur(n-1,dp)+recur(n-2,dp)+recur(n-3,dp);
}
int tribonacci(int n) {
    int *dp=malloc(sizeof(int)*(n+1));
    memset(dp,-1,sizeof(int)*(n+1));
    return recur(n,dp);
}
