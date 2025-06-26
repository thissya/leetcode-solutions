class Solution {
    public int climbStairs(int n) {
        int n1 = 0;
        int n2 = 1;
        if(n==0){
            return 0;
        }    
        for(int i=0;i<n;i++){
            int c = n1+n2;
            n1=n2;
            n2=c;
        }
        return n2;
    }
}
