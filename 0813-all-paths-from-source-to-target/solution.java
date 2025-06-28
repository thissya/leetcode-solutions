class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        List<Integer> cur = new ArrayList<>();
        cur.add(0);
        dfs(0,n-1,cur,graph);
        return res;
    }

    public void dfs(int s, int e,List<Integer> cur,int[][] graph){
        if(s==e){
            res.add(new ArrayList<>(cur));
            return ;
        }
        for(int i=0;i<graph[s].length;i++){
            cur.add(graph[s][i]);
            dfs(graph[s][i],e,cur,graph);
            cur.remove(cur.size()-1);
        }
    }

}

/*
public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        dfs(0,n-1,new ArrayList<>(),graph);
        return res;
    }

    public void dfs(int s, int e,List<Integer> cur,int[][] graph){
        if(s==e){
            cur.add(s);
            res.add(new ArrayList<>(cur));
            return ;
        }
        cur.add(s);
        for(int i=0;i<graph[s].length;i++){
            dfs(graph[s][i],e,cur,graph);
            cur.remove(cur.size()-1);
        }
    }
*/
