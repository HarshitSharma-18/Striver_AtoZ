class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helperFunc(dp , 0 , 0 , m , n);
    }

    public int helperFunc(int[][] dp , int i , int j , int m , int n){
        if(i == m-1 && j == n-1){
            return 1;
        }

        if(i < 0 || i >= m || j < 0 || j >= n){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        dp[i][j] = helperFunc(dp , i+1 , j , m , n) + helperFunc(dp , i , j+1 , m , n);
        return dp[i][j];
    }
}