int missingNumber(int* nums, int numsSize) {
    for(int i=0;i<=numsSize;i++)
    {
        int f=0;
        for(int j=0;j<numsSize;j++)
        {
            if(i==nums[j])
            {
                f=1;
            }
        }
        if(f==0)
        {
            return i;
        }
    }
    return 0;
}
