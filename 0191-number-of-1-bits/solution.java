class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            int rem=(n%2==0 ?0:1);
            c+=rem;
            n/=2;
        }
        return c;
    }
}
