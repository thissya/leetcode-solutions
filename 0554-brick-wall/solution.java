class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=wall.size();
        for(int i=0;i<n;i++){
            int sum=0;
            List<Integer> cur = wall.get(i);
            for(int j=0;j<cur.size()-1;j++){
                sum+=cur.get(j);
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int res=0;
        for(int val:map.values()){
            res=Math.max(val,res);
        }
        return n-res;
    }

}
