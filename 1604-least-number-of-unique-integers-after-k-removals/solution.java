class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Integer> q= new PriorityQueue<>(map.values());
        while(k>0){
            k--;
            int cur = q.poll();
            
            cur--;
            if(cur>0){
                q.add(cur);
            }
        }
        return q.size();
    }
}
