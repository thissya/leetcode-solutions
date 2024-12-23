class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map= new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pri = new PriorityQueue<>((e1,e2)-> {
            int comp=e2.getValue().compareTo(e1.getValue());
            if(comp==0){
                return e1.getKey().compareTo(e2.getKey());
            } 
            return comp;
    });

        pri.addAll(map.entrySet());
        List<String> arr= new ArrayList<>();
        int i=0;
        while(!pri.isEmpty() && i<k){
            Map.Entry<String,Integer> val=pri.poll();
            i++;
            arr.add(val.getKey());
        }
        return arr;
    }
}
