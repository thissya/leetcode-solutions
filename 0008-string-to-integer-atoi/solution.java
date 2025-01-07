class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<n && s.charAt(i)=='-'){
            i++;
            sign=-1;
        }
        else if(i<n && s.charAt(i)=='+'){
            i++;
            sign=1;
        }
        int sum=0;
        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int val=s.charAt(i)-'0';
            if(sum > (Integer.MAX_VALUE-val)/10){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE; 
            }
            sum=sum*10 +val;
            i++;
        }
        return sum*sign;
    }
}
