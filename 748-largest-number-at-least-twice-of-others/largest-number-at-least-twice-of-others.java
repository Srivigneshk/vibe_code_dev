class Solution {
    public int dominantIndex(int[] nums) {
        int[] dup = nums.clone();
        Arrays.sort(dup);
        int index = -1, n = nums.length;
        if (dup[n-1] >= 2 * dup[n-2]) {
            for (int i = 0; i < nums.length; i++) {
                if (dup[n-1] == nums[i]) index = i;
            }
        }
        return index;
    }
}