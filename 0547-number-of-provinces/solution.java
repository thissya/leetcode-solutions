class Solution {
    Set<Integer> set = new HashSet<>();
    int ans=0;
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    public int findCircleNum(int[][] isCon) {
        int n = isCon.length;
        for(int i=0;i<n;i++){
            map.put(i+1,new ArrayList<>());
            for(int j=0;j<isCon[0].length;j++){
                if(i!=j && isCon[i][j]!=0 ){
                    map.get(i+1).add(j+1);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!set.contains(i+1)){
                ans++;
                dfs(i+1);
            }
        }
        return ans;
    }
    public void dfs(int s){
        set.add(s);
        for(int neighbour : map.get(s)){
            if(set.contains(neighbour)){
                continue;
            }else{
                dfs(neighbour);
            }
        }
    }
}
