class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int stable = -1;
        int max = nums[0];
        int[] min = new int[nums.length];
        min[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < min[i + 1]) min[i] = nums[i];
            else min[i] = min[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            int score = max - min[i];
            if (score <= k) {
                stable = i;
                return stable;
            }
        }
        return stable;
    }
}