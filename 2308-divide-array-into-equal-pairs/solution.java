class Solution {
    public boolean divideArray(int[] nums) {
        int len=nums.length;
        int[] arr = new int[501];
        for(int i=0;i<len;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<len;i++){
            if(arr[nums[i]] % 2 !=0){
                return false;
            }
        }
        return true;
    }
}
