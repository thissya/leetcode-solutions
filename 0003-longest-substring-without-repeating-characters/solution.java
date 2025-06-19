class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int r=0,l=0;
        int max=0;
        Set<Character> str = new HashSet<>();
        while(r<n){
            if(str.contains(s.charAt(r))){
                while(s.charAt(l)!=s.charAt(r)){
                    str.remove(s.charAt(l));
                    l++;
                }
                str.remove(s.charAt(l));
                l++;
            }
            str.add(s.charAt(r));
            r++;
            max=Math.max(max,r-l);
        }
        return max;
    }
}
