int firstMissingPositive(int* nums, int n) {
    for(int i=0;i<n;i++){
        while(nums[i]>0 &&nums[i]<=n && nums[i]!=nums[nums[i]-1]){
            int temp = nums[nums[i]-1];
            nums[nums[i]-1] = nums[i];
            nums[i] = temp;
        }
    }
    int i=0;
    for(i=0;i<n;i++){
        if(nums[i]!=i+1){
            return i+1; 
        }
    }
    return i+1;
}
