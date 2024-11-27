class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int co = 0;
        if (matrix.length == 0 || matrix[0].length == 0)
            return 0;
        for (int r1 = 0; r1 < matrix.length; r1++) {
            int[] count = new int[matrix[0].length];

            for (int r2 = r1; r2 < matrix.length; r2++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    count[c] += matrix[r2][c];
                }
                co += find(count, target);
            }

        }
        return co;
    }

    private static int find(int[] arr, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0, prefixsum = 0;
        hm.put(0, 1);
        for (int num : arr) {
            prefixsum += num;
            count += hm.getOrDefault(prefixsum - target, 0);
            hm.put(prefixsum, hm.getOrDefault(prefixsum, 0) + 1);
        }
        return count;
    }
}
