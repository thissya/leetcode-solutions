bool isArraySpecial(int* nums, int n) {
    int odd=0;
    int even=0;
    for(int i=0;i<n;i++){
        if(nums[i]%2==0){
            if(even==1){
                return false;
            }
            even=1;
            odd=0;
        }else{
            if(odd==1){
                return false;
            }
            odd=1;
            even=0;
        }
    }
    return true;
}
