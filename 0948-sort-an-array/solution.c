/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int compare(void *n1,void *n2){
    if(*(int *)n1 > *(int *)n2){
        return 1;
    }
    return -1;
}

int* sortArray(int* nums, int numsSize, int* returnSize) {
    qsort(nums,numsSize,sizeof(int),compare);
    *returnSize=numsSize;
    return nums;
}
