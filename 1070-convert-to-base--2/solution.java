class Solution {
    public String baseNeg2(int n) {
        if(n==0 || n==1) return String.valueOf(n);
        if(n%2 == 0) return baseNeg2(n/-2) + "0";
        else return baseNeg2((n-1)/-2) + "1";
    }                                                   
}
