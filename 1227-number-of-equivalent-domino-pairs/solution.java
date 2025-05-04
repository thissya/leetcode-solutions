class Solution {
    public int numEquivDominoPairs(int[][] dom) {
        HashMap<String,Integer> map = new HashMap<>();
        int n=dom.length;
        int res = 0;
        for(int i=0;i<n;i++){
            int min = Math.min(dom[i][0],dom[i][1]);
            int max = Math.max(dom[i][0],dom[i][1]);
            String temp = min+" "+max;
            res+=(map.getOrDefault(temp,0));
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        return res;
    }
}
