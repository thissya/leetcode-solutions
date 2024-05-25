int minSubArrayLen(int target, int* nums, int numsSize) {
    int result=INT_MAX;
    int left=0;
    int sum=0;
    for(int i=0;i<numsSize;i++)
    {
        sum+=nums[i];
        while(sum>=target)
        {
            result=(result<i+1-left)? result:i+1-left;
            sum-=nums[left];
            left++; 
        }

    }
    return result<INT_MAX ? result:0;
    
}
