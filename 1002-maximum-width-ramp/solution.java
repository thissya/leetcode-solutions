class Solution {
    public int maxWidthRamp(int[] nums) {
       
        int ans=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            if(stack.isEmpty() || nums[stack.peek()]>nums[i])
            {
                stack.push(i);
            }
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[j])
            {
                ans=Math.max(ans,j-stack.pop());
            }
        }
        return ans;
 
    }
}

/*
//time limit exceeded
    int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=nums.length-1;j>i;j--)
            {
                if(i<j){
                    if(nums[i]<=nums[j]){
                        ans=Math.max(ans,j-i);
                    }
                }
            }
        }        
        return ans;
*/
