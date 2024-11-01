class Solution {
    public int[] twoSum(int[] num, int target) {
        int l=0,r=num.length-1;
        int[] arr= new int[2];
        while(l<r){
            if(num[l]+num[r] == target){
                arr[0]=l+1;
                arr[1]=r+1;
                break;
            }
            else if(num[l]+num[r] < target){
                l++;
            }else{
                r--;
            }
        }
        return arr;
    }
}
