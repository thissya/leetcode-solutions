bool searchMatrix(int** matrix, int Size, int* ColSize, int target){
    int row=0;
    int col= *ColSize-1;
    while(row<Size && col>=0){
        if(matrix[row][col]==target){
            return true;
        }
        else if (matrix[row][col]<target){
            row++;
        }else{
            col--;
        }
    }
    return false;
}
