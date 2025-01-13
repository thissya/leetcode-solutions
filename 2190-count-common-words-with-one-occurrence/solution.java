class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> m1= new HashMap<>();
        HashMap<String,Integer> m2= new HashMap<>();
        int n1=words1.length;
        int n2=words2.length;
        for(int i=0;i<n1;i++){
            m1.put(words1[i],m1.getOrDefault(words1[i],0)+1);
        }
        for(int i=0;i<n2;i++){
            m2.put(words2[i],m2.getOrDefault(words2[i],0)+1);
        }
        // List<String> arr1=new ArrayList<>();
        // for(Map.Entry<String,Integer> cur:m1.entrySet()){
        //     if(cur.getValue()==1){
        //         arr1.add(cur.getKey());
        //     }
        // }
        int ans=0;
        for(Map.Entry<String,Integer> cur:m2.entrySet()){
            String key=cur.getKey();
            if(cur.getValue()==1 && m1.containsKey(key) && m1.get(key)==1 ){
                ans++;
            }
        }
        return ans;
    }
}
