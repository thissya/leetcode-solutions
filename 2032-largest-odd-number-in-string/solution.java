class Solution {
    public String largestOddNumber(String num) {
        String temp="";
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                temp=num.substring(0,i+1);
                break;
            }
        }
        return temp;
    }
}
