class Solution {
    public int paths(int m,int n,Map<String,Integer> map){
         String str = m+","+n;
        if(map.containsKey(str)){
            return map.get(str);
        }
        if(n==1 && m==1)return 1;
        else if(m==0||n==0)return 0;
        map.put(str,paths(m,n-1,map)+paths(m-1,n,map));
        return map.get(str);
    }
    public int uniquePaths(int m, int n) {
        int res=paths(m,n,new HashMap<>());
        return res;
    }
}
