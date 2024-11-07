class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int[] nums = new int[2*arr.length];
        int n=arr.length;
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
            nums[i+n]=arr[i];
        }

        int[] res= new int[arr.length];
        for (int i = 0; i < n; i++) {
            res[i]=-1;
            for(int j=i+1;j<n*2;j++){
                if(arr[i]<nums[j]){
                    res[i]=nums[j];
                    break;
                }
            }
        }
        return res;
    }
}
