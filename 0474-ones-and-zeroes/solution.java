class Solution {
    public int[] countZeroesAndOnes(String str) {
        int zeros = 0, ones = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '0') zeros++;
            else if (ch == '1') ones++;
        }
        return new int[]{zeros, ones};
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (String str : strs) {
            int[] counts = countZeroesAndOnes(str);
            int zeros = counts[0];
            int ones = counts[1];

            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }
}

