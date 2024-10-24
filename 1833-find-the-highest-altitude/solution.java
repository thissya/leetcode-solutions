class Solution {
    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length+1];
        res[0]=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            res[i+1]=res[i]+gain[i];
            max=Math.max(res[i+1],max);
        }
        max=Math.max(res[0],max);
        return max;
    }
}
