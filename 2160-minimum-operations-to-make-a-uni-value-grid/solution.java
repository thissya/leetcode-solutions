class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m=grid[0].length;
        if((m*n) ==1){
            return 0;
        }
        int k=0;
        int[] arr = new int[n*m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k++]=grid[i][j];
            }
        }
        int c=0;
        Arrays.sort(arr);
        int median = arr[k/2];
        for(int i=0;i<k;i++){
            if((arr[i]-median )%x ==0)
            {
                 c+= (Math.abs(arr[i]-median)/x);
            }else{
                return -1;
            }
        }
        return c;
    }
}
