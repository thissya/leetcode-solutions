/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* singleNumber(int* nums, int numsSize, int* returnSize) {
    int *arr=(int *)malloc(2*sizeof(int));
    int k=0;
    for(int i=0;i<numsSize;i++)
    {
        int c=0;
        for(int j=0;j<numsSize;j++)
        {
            if(nums[i]==nums[j])
            {
                c++;
            }
        }
        if(c==1)
        {
            arr[k++]=nums[i];
        }
    }
    *returnSize=k;
    return arr; 
}
