class Solution {
    int[] x = {-1, 1, 0, 0};
    int[] y = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int result = 0;

        boolean[][] visited = new boolean[n][m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    dfs(grid , visited , i , j , n , m , result);
                    result++;
                }
            }
        }
        return result;
    }

    public void dfs(char[][] grid , boolean[][] visited , int i , int j , int n , int m , int result){
        visited[i][j] = true;

        for(int k = 0 ; k < 4 ; k++){
            int row = i + x[k];
            int column = j + y[k];

            if(valid(row , column , n , m) && grid[row][column] == '1' && visited[row][column] == false){
                dfs(grid , visited , row , column , n , m , result);
            }
        }
        return;
    }

    public boolean valid(int row , int column , int n , int m){
        if(row < 0 || row >= n || column < 0 || column >= m){
            return false;
        }
        return true;
    }


}