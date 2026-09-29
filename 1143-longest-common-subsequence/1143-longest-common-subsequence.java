class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n+1][m+1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helperFunc(dp , text1 , text2 , 0 , 0 , n , m);
    }

    public int helperFunc(int[][] dp , String text1 , String text2 , int i , int j , int n , int m){
        if(i == n || j == m){
            return 0;
        }

        if(dp[i][j] !=  -1) return dp[i][j];

        if(text1.charAt(i) == text2.charAt(j)){
            dp[i][j] = 1 + helperFunc(dp , text1 , text2 , i+1 , j+1 , n , m);
            return dp[i][j];
        }

        int c1 = helperFunc(dp , text1 , text2 , i+1 , j , n , m);
        int c2 = helperFunc(dp , text1 , text2 , i , j+1 , n , m);

        dp[i][j] = Math.max(c1 , c2);
        return dp[i][j];
    }
}