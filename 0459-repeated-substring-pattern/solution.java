class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String twice=s+s;
        String sub=twice.substring(1,twice.length()-1);
        return sub.contains(s);
    }
}
