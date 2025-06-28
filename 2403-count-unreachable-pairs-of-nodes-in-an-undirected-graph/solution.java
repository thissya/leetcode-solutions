class Solution {
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    Set<Integer> set = new HashSet<>(); 
    long c=0;
    public long countPairs(int n, int[][] edges) {
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        long ans =0;
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                c=0;
                dfs(i);
                ans+=(c*(n-c));
            }
        }    
        return ans/2;
    }
    public void dfs(int cur){
        set.add(cur);
        c++;
        for(int neighbour:map.get(cur)){
            if(!set.contains(neighbour)){
                dfs(neighbour);
            }
        }
    }


}
