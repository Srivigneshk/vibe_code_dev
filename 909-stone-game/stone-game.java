class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        return helper(piles, 0, n - 1, dp) > 0;
    }
    private int helper(int[] nums, int l, int r, int[][] dp) {
        if (l == r) return nums[l];
        if (dp[l][r] != Integer.MIN_VALUE) return dp[l][r];
        int left = nums[l] - helper(nums, l + 1, r, dp);
        int right = nums[r] - helper(nums, l, r - 1, dp);
        return dp[l][r] = Math.max(left, right);
    }
}