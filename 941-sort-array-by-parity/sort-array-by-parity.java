class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int count = 0;    
        for(int i = 0; i <nums.length;i++ ){
            if(nums[i]%2==0){
                res[count]=nums[i];
                count++;
            }
        }
        for(int j = 0;j< nums.length;j++){
            if(nums[j]%2!=0){
                res[count] = nums[j];
                count++;
            }
        }
        return res;
    }
}