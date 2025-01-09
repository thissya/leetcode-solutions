class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans=0,n=words.length;
        for(int i=0;i<n;i++){
            if(words[i].startsWith(pref)){
                ans++;
            }
        }
        return ans;
    }
}
