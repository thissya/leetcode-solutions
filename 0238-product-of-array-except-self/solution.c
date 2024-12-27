/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* nums, int n, int* returnSize) {
    int left[n];
    left[0]=1;
    for(int i=1;i<n;i++){
        left[i]=left[i-1]*nums[i-1];
    }
    int right[n];
    right[n-1]=1;
    for(int i=n-2;i>=0;i--){
        right[i]=right[i+1]*nums[i+1];
    }
    int *ans=(int *)malloc(sizeof(int )*n);
    for(int i=0;i<n;i++){
        ans[i]=left[i]*right[i];
    }
    *returnSize = n;
    return ans;
}
