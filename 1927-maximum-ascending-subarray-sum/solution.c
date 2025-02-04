int maxAscendingSum(int* nums, int numsSize) {
    int max=0;
    int sum=nums[0];
    for(int i=1;i<numsSize;i++){
        if(nums[i-1]<nums[i]){
            sum+=nums[i];
        }
        else{
            max=fmax(sum,max);
            sum=nums[i];
        }
    }
    max=fmax(sum,max);
    return max;
}
