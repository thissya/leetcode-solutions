/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* rearrangeArray(int* nums, int numsSize, int* returnSize) {
    int pos[numsSize];
    int neg[numsSize];
    int p=0;
    int n=0;
    for(int i=0;i<numsSize;i++)
    {
        if(nums[i]>=0)
        {
            pos[p++]=nums[i];
        }
        else{
            neg[n++]=nums[i];
        }
    }
    int j=0,k=0;
    int* arr = (int*)malloc(numsSize * sizeof(int));
    for(int i=0;i<numsSize;i++)
    {
        if(i%2==0)
        {
            arr[i]=pos[j++];
        }
        else{
            arr[i]=neg[k++];
        }
    }
    *returnSize=numsSize;
    return arr;
}
