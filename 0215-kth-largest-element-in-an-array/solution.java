class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pri = new PriorityQueue<>((e1,e2)-> e2.compareTo(e1));
       int n = nums.length;
       for(int i=0;i<n;i++){
            pri.add(nums[i]);
       }
       for(int i=0;i<k-1;i++){
        pri.poll();
       }
       return pri.peek();
    }
}
