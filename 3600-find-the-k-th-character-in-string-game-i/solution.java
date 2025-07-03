class Solution {
    public String nextChar(String str){
        String temp="";
        for(int i=0;i<str.length();i++){
            char c=(char)str.charAt(i);
            if(c>='a' || c<='y'){
                temp+=(char)(c+1);
            }else if(c=='z'){
                temp+='a';
            }
        }
        return str+temp;
    }
    public char kthCharacter(int k) {
        String str="a";
        for(int i=0;str.length()<k;i++){
            str=nextChar(str);
        }
        return (char)str.charAt(k-1);
    }
}
