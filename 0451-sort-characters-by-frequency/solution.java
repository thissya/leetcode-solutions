class Solution {
    public String frequencySort(String s) {
        char[] arr= s.toCharArray();
        HashMap<Character,Integer> map= new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }    

        PriorityQueue<Map.Entry<Character,Integer>> pri = new PriorityQueue<>((e1,e2)-> e2.getValue().compareTo(e1.getValue()));
        pri.addAll(map.entrySet());

        StringBuilder str = new StringBuilder("");
        while(!pri.isEmpty())
        {
            Map.Entry<Character,Integer> val = pri.poll();
            char curchar = val.getKey();
            int curval = val.getValue();

            str.append(String.valueOf(curchar).repeat(curval));
        }
        return str.toString();

    }
}
