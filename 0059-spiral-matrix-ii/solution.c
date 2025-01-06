/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** generateMatrix(int n, int* returnSize, int** returnColumnSizes) {
        
        int **arr=(int **)malloc(sizeof(int*)*n);
        
        for(int i=0;i<n;i++){
            arr[i]=(int *)malloc(sizeof(int)*n);
        }
        
        *returnSize=n;
        *returnColumnSizes = (int *)malloc(sizeof(int)*n);
        for(int i=0;i<n;i++){
            (*returnColumnSizes)[i]=n;
        }
        int val=1;
        int left=0,right=n-1;
        int top=0,bottom=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=val++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=val++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=val++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=val++;
                }
                left++;
            }
        }    
        return arr;
}
