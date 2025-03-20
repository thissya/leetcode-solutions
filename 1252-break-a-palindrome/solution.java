class Solution {
    public String breakPalindrome(String palindrome) {
        int n=palindrome.length();
        if(n==1){
            return "";
        }
        for(int i=0;i<(n/2);i++){
            if(palindrome.charAt(i)!='a'){
                StringBuilder str= new StringBuilder(palindrome);
                str.setCharAt(i,'a');
                return str.toString();
            }
        }
        StringBuilder str= new StringBuilder(palindrome);
        str.setCharAt(n-1,'b');
        return str.toString();
    }
}
