int singleNumber(int* nums, int numsSize) 
{
    int i=0;
    while(i<numsSize)
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
            return nums[i];
        }
        i++;
    }
    return -1;   
}
