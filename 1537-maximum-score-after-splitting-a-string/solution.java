class Solution {
    public int ones(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')c++;
        }
        return c;
    }
    public int zero(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                c++;
            }
        }
        return c;
    }
    public int maxScore(String s) {
        int ans=0;
        for(int i=1;i<s.length();i++){
            int c=zero(s.substring(0,i));
            c+=ones(s.substring(i,s.length()));
            ans=Math.max(ans,c);
        }
        return ans;
    }
}
