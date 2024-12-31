class Solution {
public:
    int compute(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=(rem*rem);
            n/=10;
        }
        return sum;
    }
    bool isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=compute(slow);
            fast=compute(fast);
            fast=compute(fast);
            if(fast==slow && (slow!=1 || fast!=1)){
                return false;
            }
        }
        return true;
    }
};
