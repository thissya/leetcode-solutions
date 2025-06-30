class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                }
            }
        }
        if(fresh ==0){
            return 0;
        }
        int min = -1;
        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!q.isEmpty()) {
            int c = q.size();

            while (c > 0) {
                c--;
                int[] rot = q.poll();
                int x = rot[0];
                int y = rot[1];
                for (int[] dir : directions) {
                    int i = x + dir[0];
                    int j = y + dir[1];
                    if (i >= 0 && i <n && j >= 0 && j < m && grid[i][j] == 1) {
                        grid[i][j] = 2;
                        q.add(new int[] { i, j });
                        fresh--;
                    }
                }
            }
            min++;
        }

        return fresh==0?min:-1;

    }
}
