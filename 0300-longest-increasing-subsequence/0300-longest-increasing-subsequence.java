class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helperFunc(dp , nums , 0 , n , -1);
    }

    public int helperFunc(int[][] dp , int[] nums , int i , int n , int prev){
        if(i == n){
            return 0;
        }

        if(dp[i][prev + 1] != -1) return dp[i][prev + 1];

        if(prev == -1 || nums[i] > nums[prev]){
            int c1 = 1 + helperFunc(dp , nums , i+1 , n , i);
            int c2 = helperFunc(dp , nums , i+1 , n , prev);
            dp[i][prev + 1] = Math.max(c1 , c2);
            return dp[i][prev + 1];
        }

        dp[i][prev + 1] = helperFunc(dp , nums , i+1 , n , prev);
        return dp[i][prev + 1];
    }
}