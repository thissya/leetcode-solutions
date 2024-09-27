class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr= new int[n][n];
        int val=1;
        int left=0,right=n-1;
        int top=0,bottom=n-1;
        while(left<=right && top <=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]=val++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr[i][right]=val++;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    arr[bottom][i]=val++;
                }
            }
            bottom--;
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    arr[i][left]=val++;
                }
            }
            left++;
        }
        return arr;
    }
}
