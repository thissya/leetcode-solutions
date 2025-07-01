class Pair{
    int node;
    int dist;
    public Pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
}

class Solution {
    public int networkDelayTime(int[][] edges, int n, int k) {
        PriorityQueue<Pair> que = new PriorityQueue<>((a,b)->a.dist - b.dist);
        List<List<int[]>> map = new ArrayList<>();
        
        for(int i=0;i<=n;i++){
            map.add(new ArrayList<>());
        }

        for(int[] ed:edges){
            int u=ed[0];
            int v=ed[1];
            int w=ed[2];
            map.get(u).add(new int[]{v,w});
        }
        int[] res = new int[n+1];
        res[0]=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            res[i]=Integer.MAX_VALUE;
        }
        que.add(new Pair(k,0));
        res[k]=0;

        while(!que.isEmpty()){
            Pair cur = que.poll();
            int u = cur.node;
            int distance = cur.dist;
            for(int[] neighbour:map.get(u)){
                int v = neighbour[0];
                int weight = neighbour[1];
                if(distance+weight < res[v]){
                    res[v]=distance+weight;
                    que.add(new Pair(v,res[v]));
                }
            }
        }

        int ans =0;
        for(int i:res){
            ans=Math.max(i,ans);
        }
        return ans==Integer.MAX_VALUE?-1:ans;

    }
}
