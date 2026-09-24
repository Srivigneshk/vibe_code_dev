class Solution {
    public int smallestIndex(int[] nums) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i], sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == i) {
                index = i;
                return index;
            }
        }
        return index;
    }
}