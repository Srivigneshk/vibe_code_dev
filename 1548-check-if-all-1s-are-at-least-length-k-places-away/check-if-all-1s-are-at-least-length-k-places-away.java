class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length,count = k;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                if (count < k) return false;
                count = 0;
            } else count++;
        }
        return true;
    }
}