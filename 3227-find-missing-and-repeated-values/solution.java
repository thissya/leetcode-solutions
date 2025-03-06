class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        TreeSet<Integer> sort = new TreeSet<>();
        int n=grid.length;
        int m=grid[0].length;
        int[] arr = new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(sort.contains(grid[i][j])){
                    arr[0]=grid[i][j];
                }else{
                    sort.add(grid[i][j]);
                }
            }
        }
        int f=0;
        int i=0;
        for(int val:sort){
            if(val!=(i+1)){
                f=1;
                arr[1]=i+1;
                break;
            }
            i++;
        }
        if(f==0){
            arr[1]=m*n;
        }
        return arr;
    }
}
