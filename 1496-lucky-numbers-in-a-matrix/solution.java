class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> rows= new ArrayList<>();
        List<Integer> cols= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                min=Math.min(min,matrix[i][j]);
            }
            rows.add(min);
        }
        for(int j=0;j<matrix[0].length;j++)
        {
            int max=Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++)
            {
                max=Math.max(max,matrix[i][j]);
            }
            cols.add(max);
        }
        for(int i:rows)
        {
            if(cols.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}
