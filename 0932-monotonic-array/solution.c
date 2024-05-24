bool isMonotonic(int* nums, int numsSize) {
    int dec=0;
    int inc=0;
    for(int i=0;i<numsSize-1;i++)
    {
        if(nums[i]>=nums[i+1])
        {
            dec++;
        }
        if(nums[i]<=nums[i+1])
        {
            inc++;
        }
    }
    if(inc==numsSize-1 || dec==numsSize-1)
    {
        return true;
    }
    return false;
}
