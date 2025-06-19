class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> res = new ArrayList<>();
        int n=grid.length;
        int m= grid[0].length;
        boolean f=true;
        boolean alt=true;
        for(int i=0;i<n;i++){
            int start=0;
            if(alt){
                alt=false;
                for(int j=0;j<m;j++){
                    if(f){
                        f=false;
                        res.add(grid[i][j]);
                    }else{
                        f=true;
                    }
                }
            }else{
                alt=true;
                start=m-1;
                for(int j=m-1;j>=0;j--){
                    if(f){
                        f=false;
                        res.add(grid[i][j]);
                    }else{
                        f=true;
                    }
                }
            }
        }    
        return res;
    }
}
