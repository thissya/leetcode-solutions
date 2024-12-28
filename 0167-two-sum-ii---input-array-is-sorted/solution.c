/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* num, int n, int target, int* returnSize) {
    int l=0,r=n-1;
    int *arr = (int *)malloc(sizeof(int )*2);
    while(l<r){
        int a=num[l]+num[r];
        if(a == target){
            arr[0]=l+1;
            arr[1]=r+1;
            break;
        }else if(a < target){
            l++;
        }else{
            r--;
        }
    }
    *returnSize=2;
    return arr;
}
