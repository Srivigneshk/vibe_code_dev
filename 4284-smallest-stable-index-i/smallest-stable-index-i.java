class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int stable = -1;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            int min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) min = nums[j];
            }
            int score = max - min;
            if (score <= k) {
                stable = i;
                return stable;
            }
        }
        return stable;
    }
}