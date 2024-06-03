class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0;
        int n=t.length();
        int m=s.length();
        while(i<m && j<n)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                j++;
            }
            i++;
        }
        return n-j;
    }
}
