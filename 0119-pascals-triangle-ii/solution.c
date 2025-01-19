/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getRow(int rowIndex, int* returnSize) {
    int n=rowIndex+1;
    int res[n+1][n+1];
    int *ans=malloc(sizeof(int)*n);
    ans[0]=1;
    *returnSize=n;
    if(n==1)return ans;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            if(j==0 || j==i){
                res[i][j]=1;
            }else{
                res[i][j]=res[i-1][j-1]+res[i-1][j];
            }
            if(i==n-1){
                ans[j]=res[i][j];
            }
        }
    }
    return ans;
}
