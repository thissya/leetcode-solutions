class Solution {
    public boolean isSameAfterReversals(int n) {
        int temp =n;
        int rev=0;
        while(temp>0)
        {
            rev=(rev*10)+ temp%10;
            temp/=10;
        }
        int temp2=0;
        while(rev>0)
        {
            temp2=(temp2*10)+rev%10;
            rev/=10;
        }
        return (temp2==n);
    }
}
