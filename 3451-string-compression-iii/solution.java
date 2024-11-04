class Solution {
    public String compressedString(String word) {
        int cnt=0;
        StringBuilder str= new StringBuilder("");
        char c=word.charAt(0);
        for(int i=0;i<word.length();i++){
            if(c==word.charAt(i) && cnt<9){
                cnt++;
            }else{
                str.append(cnt).append(c);
                c=word.charAt(i);
                cnt=1;
            }
        }
        str.append(cnt).append(c);
        return str.toString();
    }
}
