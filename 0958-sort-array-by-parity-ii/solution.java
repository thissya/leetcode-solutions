class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        //for reducing time complexity 
        int even=0,odd=1;
        int[] res= new int[nums.length];
        for(int num:nums)
        {
            if(num%2==0){
                res[even]=num;
                even+=2;
            }
            else{
                res[odd]=num;
                odd+=2;
            }
        }
        return res;
    }
}
/*
//reducing space complexity 
for(int i=0;i<nums.length;i++){
            if(i%2==0){
                int temp=i;
                while(nums[temp]%2!=0)
                {
                    temp++;
                }
                int temp2 = nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp2;
            }
            else{
                int temp=i;
                while(nums[temp]%2==0)
                {
                    temp++;
                }
                int temp2 = nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp2;
            }
        }  
        return nums;   
*/
