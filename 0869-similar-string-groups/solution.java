class Solution {
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        int group=0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                group++;
                dfs(n, strs, visited, i);
            }
        }
        return group;
    }

    public void dfs(int n,String[] strs,boolean[] visited,int i){
        visited[i]=true;
        
        for(int j=0;j<n;j++){
            if(!visited[j] && check(strs[i],strs[j])){
                dfs(n,strs,visited,j);
            }
        }

    }

    public boolean check(String a, String b) {
        if (a.equals(b)) {
            return true;
        }
        int n = a.length();
        if (n != b.length()) {
            return false;
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                c++;
            }
            if (c > 2) {
                return false;
            }
        }
        return c == 2;
    }
}
