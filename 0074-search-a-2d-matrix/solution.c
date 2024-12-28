bool searchMatrix(int** matrix, int m, int* n, int target) {
    int l=0;
    int r=m* *n-1;
    while(l<=r){
        int mid = (l+r)/2;
        int row = mid / *n ;
        int col = mid% *n;
        if(matrix[row][col]==target){
            return true;
        }else if (matrix[row][col]<target){
            l=mid+1;
        }else{
            r=mid-1;
        }
    }
    return false;
}
