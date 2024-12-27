class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int min = prices[0];
        int max=0;
        int pro=0;
        for(int i=1;i<n;i++){
            min=fmin(prices[i],min);
            pro=prices[i]-min;
            max=fmax(pro,max);
        }
        return max;
    }
};
