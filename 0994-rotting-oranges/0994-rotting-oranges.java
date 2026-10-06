class Solution {
    int[] x = {-1, 1, 0, 0};
    int[] y = {0, 0, -1, 1};

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;
        int time = 0;

        // Put all rotten oranges into queue
        // and count fresh oranges
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {

                    q.add(new int[]{i, j});

                } else if (grid[i][j] == 1) {

                    fresh++;
                }
            }
        }

        // BFS
        while (!q.isEmpty() && fresh > 0) {

            time++;

            int size = q.size();

            while (size > 0) {

                int[] p = q.poll();

                int r = p[0];
                int c = p[1];

                for (int k = 0; k < 4; k++) {

                    int row = r + x[k];
                    int col = c + y[k];

                    if (valid(row, col, n, m)
                            && grid[row][col] == 1) {

                        q.add(new int[]{row, col});

                        // Mark as rotten
                        grid[row][col] = 2;

                        fresh--;
                    }
                }

                size--;
            }
        }

        if (fresh > 0) {
            return -1;
        }

        return time;
    }

    public boolean valid(int row, int col, int n, int m) {

        return row >= 0 &&
               row < n &&
               col >= 0 &&
               col < m;
    }
}