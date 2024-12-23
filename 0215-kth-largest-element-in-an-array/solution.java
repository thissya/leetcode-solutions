class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pri= new PriorityQueue<>((n1,n2)-> n2.compareTo(n1));
        for(int i=0;i<nums.length;i++){
            pri.add(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            pri.poll();
        }
        return pri.peek();
    }
}
