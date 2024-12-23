class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> arr= new PriorityQueue<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr.add(matrix[i][j]);
            }
        }
        for(int i=0;i<k-1;i++){
            arr.poll();
        }
        return arr.poll();
    }
}
