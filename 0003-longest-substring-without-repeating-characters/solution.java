class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0;
        int r=0,res=0;
        Set<Character> set = new HashSet<>();
        while(r<n){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
                set.add(s.charAt(r));
                r++;
                res = Math.max(res,r-l);
            
        }
        return res;
    }
}
