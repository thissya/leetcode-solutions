class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int min = Integer.MAX_VALUE;
        int n = tops.length;
        outer: for (int i = 1; i <= 6; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (tops[j] == i) {

                } else if (bottoms[j] == i) {
                    count++;
                } else {
                    continue outer;
                }
            }
            min = Math.min(min, count);
            count = 0;
            for (int j = 0; j < n; j++) {
                if (bottoms[j] == i) {

                } else if (tops[j] == i) {
                    count++;
                }
            }
            min = Math.min(min, count);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
