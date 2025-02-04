int longestMonotonicSubarray(int* nums, int numsSize) {
    int n1=1;
    int max1=1;
    int n2=1;
    for(int i=1;i<numsSize;i++){
        if(nums[i-1]<nums[i]){
            n1+=1;
        }else{
            max1=fmax(n1,max1);
            n1=1;
        }
    }
    max1=fmax(max1,n1);
    int max2=1;
    for(int i=1;i<numsSize;i++){
        if(nums[i-1]>nums[i]){
            n2+=1;
        }else{
            max2=fmax(n2,max2);
            n2=1;
        }
    }
    max2=fmax(n2,max2);
    return fmax(max1,max2);
}
