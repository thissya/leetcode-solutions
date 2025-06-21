class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stk = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            stk.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=nums[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=stk.peek();
            }
            stk.push(nums[i]);
        }
        return res;
    }
}
