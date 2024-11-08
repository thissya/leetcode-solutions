class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,lm=0,rm=0,res=0;
        while(left<right){
            if(height[left]<height[right]){
                if(lm<height[left]){
                    lm=height[left];
                }else{
                    res+=lm-height[left];
                }
                left++;
            }else{
                if(rm<height[right]){
                    rm=height[right];
                }else{
                    res+=rm-height[right];
                }
                right--;
            }
        }
        return res;
    }
}
