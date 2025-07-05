class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int n =prices.length;
        for(int i=0;i<n;i++){
            int cur = prices[i];
            if(cur<min){
                min = cur;
            }else {
                max = Math.max(max,cur-min);
            }
        }
        return max;
    }
}
