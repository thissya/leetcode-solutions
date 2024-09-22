class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4)
        {
            int temp=0;
            while(n>0)
            {
                int rem= n%10;
                temp+=(rem*rem);
                n/=10;
            }
            n=temp;
        }
        return n==1;
    }
}
