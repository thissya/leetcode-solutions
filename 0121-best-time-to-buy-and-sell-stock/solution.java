class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int profit=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            min=Math.min(prices[i],min);
            profit = prices[i]-min;
            max=Math.max(profit,max);
        }
        return max;
    }
}
