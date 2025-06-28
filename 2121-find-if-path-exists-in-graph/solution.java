class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       HashMap<Integer,List<Integer>> map = new HashMap<>();
        int len = edges.length;
        for(int i=0;i<len;i++){
            
            int ver = edges[i][0];
            int edg = edges[i][1];
            if(!map.containsKey(ver)){
                map.put(ver,new ArrayList<>());
            }
            map.get(ver).add(edg);

            if(!map.containsKey(edg)){
                map.put(edg,new ArrayList<>());
            }
            map.get(edg).add(ver);
        }
        boolean[] visited = new boolean[n];
        return dfs(map,visited,source,destination);
    }

    public boolean dfs(HashMap<Integer,List<Integer>> graph,boolean[] visit,int cur,int des){
        if(cur==des){
            return true;
        }

        visit[cur]=true;
        for(int neighbour:graph.get(cur)){
            if(visit[neighbour]!=true){
                boolean path = dfs(graph,visit,neighbour,des);
                if(path){
                    return true;
                }
            }
        }
        return false;
    }

}
