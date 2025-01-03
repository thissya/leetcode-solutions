class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long[] res= new long[n+1];
        for(int i=0;i<n;i++){
            res[i+1]=res[i]+nums[i];
            System.out.println(res[i+1]);
        }
        int c=0;
        for(int i=0;i<n-1;i++){
            if(res[i+1]>=res[n]-res[i+1]){
                c++;
            }
        }

        return c;
    }
}
