class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length, moves = 0;
        Arrays.sort(nums);
        int max = nums[n-1];
        for(int i = 0;i < n;i++){
            if(nums[i]<=max){
                int dif = max - nums[i];
                moves+=dif;
            }
        }
        return moves;
    }
}