class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> arr= new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pri= new PriorityQueue<>((e1,e2)-> e2.getValue().compareTo(e1.getValue()));
        pri.addAll(map.entrySet());
        int[] ans= new int[k];
        int i=0;
        while(!pri.isEmpty() && i<k){
            Map.Entry<Integer,Integer> val=pri.poll();
            ans[i++]=val.getKey();
        }
        return ans;
    }
}
