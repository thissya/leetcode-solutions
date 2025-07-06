class Solution {
    public int distinctAverages(int[] nums) {

        Arrays.sort(nums);
        int c=0,l=0,r=nums.length-1;
        
        HashSet<Double> set = new HashSet<>();
        
        while(l<r){
            double ans = (nums[l]+nums[r])/2.0;
            if(set.add(ans)){
                c++;
            }
            l++;
            r--;
        }
        
        return c;
     
    }
}
