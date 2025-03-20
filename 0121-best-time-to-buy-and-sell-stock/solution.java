class Solution {
    public int maxProfit(int[] prices){
        int min =Integer.MAX_VALUE;
        int max=0;
        for(int cur:prices){
            if(cur<min){
                min=cur;
            }else{
                max=Math.max(max,cur-min);
            }
        }
        return max;
    }        
}
