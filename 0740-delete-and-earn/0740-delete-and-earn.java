class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] points = new int[10001];

        for (int num : nums) {
            points[num] += num;
        }

        int[] dp = new int[10001];

        Arrays.fill(dp, -1);

        return helper(0,points, dp);
    }

    public int helper(int i, int[] points, int[] dp) {

        if (i >= points.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int take = points[i] + helper(i + 2, points, dp);
        int noTake = helper(i + 1, points, dp);

        dp[i] = Math.max(take, noTake);

        return dp[i];
    }
}