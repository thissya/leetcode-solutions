void sortColors(int* nums, int numsSize) 
{
     for(int i=0;i<numsSize;i++)
     {
        for(int j=0;j<numsSize;j++)
        {
            if(nums[i]<nums[j])
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
     }
    printf("[");
     for(int i=0;i<numsSize-1;i++)
     {
        printf("%d,",nums[i]);
     }
     printf("%d]",nums[numsSize-1]);

}
