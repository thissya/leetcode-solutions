/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int second(int l,int r,int target,int* nums){
    int ans=-1;
    while(l<=r){
        int mid = (l+r)/2;
        if(nums[mid]<=target){
            l=mid+1;
        }else{
            r=mid-1;
        }
        if(nums[mid] ==target ){
            ans= mid;
        }
    }
    return ans;
}
int first(int l,int r,int target,int* nums){
    int ans=-1;
    while(l<=r){
        int mid=(l+r)/2;
        if(nums[mid]>=target){
            r=mid-1;
        }else{
            l=mid+1;
        }
        if(nums[mid]==target){
            ans= mid;
        }
    }
    return ans;
}
int* searchRange(int* nums, int n, int target, int* returnSize) {
    int l=0;
    int r=n-1;
    int *arr= malloc(sizeof(int)*2);
    arr[0]=-1;
    arr[1]=-1;
    *returnSize=2;
    if(n==0)return arr;
    arr[0]=first(l,r,target,nums);
    arr[1]=second(l,r,target,nums);
    return arr;
}

