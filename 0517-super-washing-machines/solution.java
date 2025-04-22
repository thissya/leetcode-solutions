class Solution {
    public int findMinMoves(int[] machines) {
        int sum=0;
        int n=machines.length;
        for(int i=0;i<n;i++){
            sum+=machines[i];
        }    
        if(sum%n!=0){
            return -1;
        }
        int val=sum/n;
        int maxMoves = 0;
        int balance = 0;

        for(int num:machines){
            int temp=num-val;
            balance+=temp;
            maxMoves=Math.max(maxMoves,Math.max(Math.abs(balance),temp));
        }
        return maxMoves;
    }
}
