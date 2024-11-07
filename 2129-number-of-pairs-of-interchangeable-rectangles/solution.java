class Solution {
    public long interchangeableRectangles(int[][] rec) {
        long c=0;
        int n=rec.length;
        HashMap<Double,Integer> map= new HashMap<>();
        
        for(int i=0;i<n;i++){
            double res=(double) rec[i][0] / rec[i][1];
            if(map.containsKey(res)){
                c+=map.get(res);
                map.put(res,map.get(res)+1);
            }else{
                map.put(res,1);
            }
        }
        return c;
    }
}
