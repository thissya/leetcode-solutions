class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int val:nums2){
            while(!stack.isEmpty() && stack.peek()<val){
                map.put(stack.peek(),val);
                stack.pop();
            }
            stack.push(val);
        }
        while(!stack.isEmpty()){
            map.put(stack.peek(),-1);
            stack.pop();
        }
        int[] res= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
