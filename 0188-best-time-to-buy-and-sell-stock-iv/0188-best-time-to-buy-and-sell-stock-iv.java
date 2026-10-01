class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n+1][(2*k)+1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Fill first column with 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        // Fill last row with 0
        for (int j = 0; j <= 2 * k; j++) {
            dp[n][j] = 0;
        } 

        for(int i = n-1 ; i >= 0 ; i--){
            for (int j = 1; j <= 2 * k; j++){

                if(j % 2 == 0){
                    int c1 = dp[i+1][j-1] - prices[i];
                    int c2 = dp[i+1][j];

                    dp[i][j] = Math.max(c1 , c2);
                }
                else{
                    int c1 = dp[i+1][j-1] + prices[i];
                    int c2 = dp[i+1][j];

                    dp[i][j] = Math.max(c1 , c2);
                }
            }
        }

        return dp[0][k*2];
    }
}