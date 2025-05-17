class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int r=0,w=0,b=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                r++;
            }else if(nums[i]==1){
                w++;
            }
            else {
                b++;
            }
        }
        int ind=0;
        while(r>0){
            nums[ind]=0;
            r--;
            ind++;
        }
        while(w>0){
            nums[ind]=1;
            ind++;
            w--;
        }
        while(b>0){
            nums[ind]=2;
            ind++;
            b--;
        }

    }
}
