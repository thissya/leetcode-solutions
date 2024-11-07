class Solution {
    public int largestCombination(int[] can) {
        int ans=0;
        for(int i=0;i<32;i++)
        {
            int cnt=0;
            for(int c:can){
                if( (c & (1<<i) ) !=0){
                    cnt++;
                }
            }
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}
