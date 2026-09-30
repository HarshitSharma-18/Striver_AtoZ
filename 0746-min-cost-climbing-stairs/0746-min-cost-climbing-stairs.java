class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);

        return Math.min(helperFunc(dp , cost , 0 , n), helperFunc(dp , cost , 1 , n));
    }

    public int helperFunc(int[] dp , int[] cost , int i , int n){
        if(i >= n){
            return 0;
        }

        if(i > n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int c1 = cost[i] + helperFunc(dp ,cost , i+1 , n);
        int c2 = cost[i] + helperFunc(dp , cost ,i+2 , n);

        dp[i] = Math.min(c1 , c2);
        return dp[i];
    }
}