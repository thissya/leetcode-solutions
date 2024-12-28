int findMin(int* nums, int n) {
    int l=0;
    int r=n-1;
    if(nums[0]<nums[n-1])return nums[0];

    while(l<=r){
        int mid=(l+r)/2;
        if(nums[mid]>nums[n-1]){
            l=mid+1;
        }else{
            r=mid-1;
        }
    }    
    return nums[l];
}

/*
int l=0,r=n-1;
    if(nums[0]<nums[r]){
        return nums[0];
    }
    while(l<r){
        int mid = (l+r)/2;
        if(nums[mid] > nums[mid+1]){
            return nums[mid+1];
        }else if (nums[mid]<nums[mid-1]){
            return nums[mid];
        }
        else if(nums[0]<nums[mid]){
            l=mid+1;
        }else{
            r=mid-1;
        }
    }
    return nums[0];
*/
