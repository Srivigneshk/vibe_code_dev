class Solution {
    public int maxDigitRange(int[] nums) {
        int max = 0, sum = 0;
        for (int num : nums) {
            int temp = num;
            int largest = 0;
            int smallest = 9;
            while (temp > 0) {
                int digit = temp % 10;
                largest = Math.max(largest, digit);
                smallest = Math.min(smallest, digit);
                temp /= 10;
            }
            int range = largest - smallest;
            if (range > max) {
                max = range;
                sum = num;
            }
            else if (range == max) {
                sum += num;
            }
        }
        return sum;
    }
}