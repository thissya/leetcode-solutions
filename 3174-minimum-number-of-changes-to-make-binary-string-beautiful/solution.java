class Solution {
    public int minChanges(String s) {
        int c=0;
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1))c++;
        }
        return c;
    }
}
/*
public int minChanges(String s) {
        int c=0;
        for(int i=0;i<s.length();i+=2){
            c+=find(s.substring(i,i+2));
        }
        return c;
    }
    public int find(String s){
        int z=0,o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')o++;
            else z++;
        }
        if(z==0 || o==0)return 0;
        return Math.min(z,o);
    }
*/
