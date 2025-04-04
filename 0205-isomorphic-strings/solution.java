class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                Character c= map.get(s.charAt(i));
                if(c!=t.charAt(i)){
                    return false;
                }
            }else{
                if(used.contains(t.charAt(i))){
                    return false;
                }
                used.add(t.charAt(i));
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}

/*
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                Character c= map.get(s.charAt(i));
                if(c!=t.charAt(i)){
                    return false;
                }
            }else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        HashMap<Character,Character> map1= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(t.charAt(i))){
                Character c= map1.get(t.charAt(i));
                if(c!=s.charAt(i)){
                    return false;
                }
            }else{
                map1.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}
*/
