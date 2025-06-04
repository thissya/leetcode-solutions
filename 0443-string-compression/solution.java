class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder("");
        char prev = chars[0];
        int n = chars.length;
        int c=1;
        for(int i=1;i<n;i++){
            if(prev == chars[i]){
                c++;
            }else{
                if(c>1){
                    str.append(prev);
                    str.append(c);
                    c=1;
                }else{
                    str.append(prev);
                }
                prev=chars[i];
                c=1;
            }
        }
        str.append(prev);
        if(c>1)str.append(c);
        int res = str.length();
        for(int i=0;i<res;i++){
            chars[i]=str.charAt(i);
        }
        return res;
    }
}
