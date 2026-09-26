class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] points = new int[10001];

        for (int num : nums) {
            points[num] += num;
        }

        int[][] dp = new int[2][10001];

        for (int i = 0; i < 2; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(dp , points , 0 ,  0);
    }
    public int helper(int[][] dp, int[] points, int i, int free){
        if (i >= points.length) {
            return 0;
        }

        if (dp[free][i] != -1) {
        return dp[free][i];
        }

        // current number ko choose nahi kar sakte
        if (free == 0) {

            dp[free][i] = helper(dp, points, i + 1, 1);

            return dp[free][i];
        }

        // current number choose kar sakte ho
        int choice1 = points[i] + helper(dp, points, i + 1, 0);

        // current number choose nahi karna
        int choice2 = helper(dp, points, i + 1, 1);

        dp[free][i] = Math.max(choice1, choice2);

        return dp[free][i];

    }
}