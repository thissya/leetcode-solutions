class Solution {
    public void reverse(int s,int e,int[] nums){
        int n=nums.length;
        int l=s;
        int r=e-1;
        while(l<r){
            int temp = nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n =nums.length;
        int drop=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                drop=i-1;
                break;
            }
        }
        if(drop==-1){
            reverse(0,n,nums);
            return;
        }else{
            int j=n-1;
            while(nums[drop]>=nums[j]){
                j--;
            }
            int temp = nums[drop];
            nums[drop]=nums[j];
            nums[j]=temp;
            reverse(drop+1,n,nums);
        }
    }
    
}
