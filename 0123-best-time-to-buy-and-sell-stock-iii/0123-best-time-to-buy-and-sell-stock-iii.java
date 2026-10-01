class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int k = 4;
        int[][] dp = new int[n+1][k+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }   

        return helperFunc(dp , prices , 0 , 4 , n);
    }

    public int helperFunc(int[][] dp , int[] prices , int i , int k , int n){
        if(i == n){
            return 0;
        }

        if(k == 0){
            return 0;
        }

        if(dp[i][k] != -1) return dp[i][k];

        if(k % 2 == 0){
            int c1 = helperFunc(dp , prices , i+1 , k-1 , n) - prices[i];
            int c2 = helperFunc(dp , prices , i+1 , k , n);

            dp[i][k] = Math.max(c1 , c2);
            return dp[i][k];
        }
        else{
            int c1 = helperFunc(dp , prices , i+1 , k-1 , n) + prices[i];
            int c2 = helperFunc(dp , prices , i+1 , k , n);

            dp[i][k] =  Math.max(c1 , c2);
            return dp[i][k];
        }
    }
}