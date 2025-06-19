class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int l=0;
            int[] temp = mat[i];
            int r = temp.length-1;
            while(l<r){
                int cur=temp[l];
                temp[l]=temp[r];
                temp[r]=cur;
                l++;
                r--;
            }
        }

    }
}
