class Solution {
    public List<List<Integer>> map = new ArrayList<>();
    public boolean canFinish(int n, int[][] prerequisites) {
        
        for(int i=0;i<n;i++){
            map.add(new ArrayList<>());
        }
        
        boolean[] visited = new boolean[n];
        boolean[] restack =  new boolean[n];

        for(int[] pre:prerequisites){
            int v=pre[0];
            int e=pre[1];
            map.get(v).add(e);
        }
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(dfs(i,visited,restack)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int cur,boolean[] visited,boolean[] restack){
        restack[cur]=true;
        visited[cur]=true;
        for(int neighbour:map.get(cur)){
            if(!visited[neighbour]){
                if(dfs(neighbour,visited,restack)){
                    return true;
                }
            }
            else if(restack[neighbour]){
                return true;
            }
        }
        restack[cur]=false;
        return false;
    }
}
