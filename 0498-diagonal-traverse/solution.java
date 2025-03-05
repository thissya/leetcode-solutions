class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        Map<Integer,List<Integer>> map = new TreeMap<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int s=i+j;
                List<Integer> l=map.getOrDefault(s,new ArrayList<>());
                l.add(mat[i][j]);
                map.put(s,l);
            }
        }    
        int[] res = new int[n*m];
        int ind=0;
        for(int i:map.keySet()){
            List<Integer> temp = map.get(i);
            if(i%2==0){
                Collections.reverse(temp);
            }
            for(int j=0;j<temp.size();j++){
                res[ind++]=temp.get(j);
            }
        }
        return res;
    }
}
