class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return helperFunc(dp , 0 , n);
    }

    public int helperFunc(int[] dp , int i , int n){
        if(i == n){
            return 1;
        }

        if(i > n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        dp[i] = helperFunc(dp , i+1 , n) + helperFunc(dp , i+2 , n);
        return dp[i];
    }
}