class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map= new HashMap<>();
        int n=s.length();
        int m=t.length();
        if(n!=m)return false;
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(char a:t.toCharArray()){
            map.put(a,map.getOrDefault(a,0)-1);
        }
        for(char a:s.toCharArray()){
            if(map.get(a)!=0){
                return false;
            }
        }
        return true;
    }
}
