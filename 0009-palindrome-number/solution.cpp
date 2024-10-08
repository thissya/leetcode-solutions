class Solution {
public:
    bool isPalindrome(int x) {
        long a=x;
        if(x<0)return false;
        long sum=0;
        while(x>0)
        {
            sum=sum*10+(x%10);
            x/=10;
        }
        if(sum==a)return true;
        return false;
    }
};
