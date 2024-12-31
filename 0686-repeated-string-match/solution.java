class Solution {
    public int repeatedStringMatch(String a, String b) {
        int ans=1;
        String str= new String(a);
        while(str.length()<b.length()){
            str+=a;
            ans++;
        }
        if(str.contains(b)){
            return ans;
        }
        str+=a;
        ans++;
        if(str.contains(b)){
            return ans;
        }
        return -1;
    }
}
