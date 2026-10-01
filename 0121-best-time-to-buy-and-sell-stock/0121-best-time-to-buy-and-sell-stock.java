class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][3];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Fill first column with 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        // Fill last row with 0
        for (int j = 0; j < 3; j++) {
            dp[n][j] = 0;
        } 

        for(int i = n-1 ; i >= 0 ; i--){
            dp[i][2] = Math.max(dp[i+1][1] - prices[i] , dp[i+1][2]);

            dp[i][1] = Math.max(dp[i+1][0] + prices[i] , dp[i+1][1]);
        }

        return dp[0][2];
    }
}