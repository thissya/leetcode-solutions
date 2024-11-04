class Solution {
    public int compress(char[] chars) {
        StringBuilder res= new StringBuilder("");
        int cnt=1;
        char c=chars[0];
        for(int i=1;i<chars.length;i++){
            if(c==chars[i]){
                cnt++;
            }else{
                if(cnt==1){
                    res.append(c);
                }else{
                    res.append(c).append(cnt);
                }
                cnt=1;
                c=chars[i];
            }
        }
        if(cnt==1){
            res.append(c);
        }else{
            res.append(c).append(cnt);
        }
        for(int i=0;i<res.length();i++){
            chars[i]=res.charAt(i);
        }
        return res.length();
    }
}
