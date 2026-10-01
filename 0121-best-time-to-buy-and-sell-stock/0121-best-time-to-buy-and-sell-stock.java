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
            for (int k = 1; k <= 2; k++){

                if(k == 2){
                    int c1 = dp[i+1][k-1] - prices[i];
                    int c2 = dp[i+1][k];

                    dp[i][k] = Math.max(c1 , c2);
                }
                else{
                    int c1 = dp[i+1][k-1] + prices[i];
                    int c2 = dp[i+1][k];

                    dp[i][k] = Math.max(c1 , c2);
                }
            }
        }

        return dp[0][2];
    }
}