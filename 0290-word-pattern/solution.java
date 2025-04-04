class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> used = new HashSet<>();

        int n=p.length();
        System.out.println(n);
        String[] strs = s.split("\\s+");
        if(n!=strs.length)return false;
        for(int i=0;i<n;i++){
            Character c = p.charAt(i);
            if(map.containsKey(c))
            { String temp = map.get(c); 
                if(!temp.equals(strs[i])){
                    return false;
                }
            }else{
                if(used.contains(strs[i])){
                    return false;
                }
                used.add(strs[i]);
                map.put(c,strs[i]);
            }
        }
        return true;
    }
}
