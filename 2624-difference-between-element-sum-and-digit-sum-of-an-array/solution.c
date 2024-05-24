int differenceOfSum(int* nums, int numsSize) {
    int sum=0,i=0;
    while(i<numsSize)
    {
        sum+=nums[i];
        i++;
    }
    i=0;
    int sum1=0;
    while(i<numsSize)
    {
        int num=nums[i];
        while(num!=0)
        {
            int rem=num%10;
            sum1+=rem;
            num/=10;
        }
        i++;
    }
    int ans=sum-sum1;
    return ans;
    
}
