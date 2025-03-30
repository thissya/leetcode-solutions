class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int n = inter.length;
        int[] cur = inter[0];
        for (int i = 0; i < n; i++) {
            if(cur[1]>= inter[i][0]){
                cur[1] = Math.max(cur[1],inter[i][1]); 
            }else{
                res.add(cur);
                cur=inter[i];
            }
        }
        res.add(cur);
        return res.toArray(new int[res.size()][]);
    }
}
