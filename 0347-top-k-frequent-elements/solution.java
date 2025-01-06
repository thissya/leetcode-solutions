class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pri = new PriorityQueue<>((e1,e2)-> e2.getValue().compareTo(e1.getValue()));
        pri.addAll(map.entrySet());
        int i=0;
        int[] res= new int[k];
        while(!pri.isEmpty() && i<k){
            Map.Entry<Integer,Integer> cur= pri.poll();
            res[i]=cur.getKey();
            i++;
        }
        return res;
    }
}
