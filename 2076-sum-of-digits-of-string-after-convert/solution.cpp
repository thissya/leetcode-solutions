#include<string>
class Solution {
public:
    int getLucky(string s, int k) {
        int sum=0;
        for(char ch:s){
            int num = ch-'a' +1;
            while(num>0){
                sum=sum+num%10;
                num/=10;
            }
        }
        printf("%d\n",sum);
        while(--k>0){
            int temp=sum;
            int ans=0;
            while(temp>0){
                int rem=temp%10;
                ans+=rem;
                temp/=10;
            }
        
            sum=ans;
        }
        return sum;
    }
};
