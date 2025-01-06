class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pri = new PriorityQueue<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            pri.add(nums[i]);
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=pri.poll();
        }
        return res;
    }
}
