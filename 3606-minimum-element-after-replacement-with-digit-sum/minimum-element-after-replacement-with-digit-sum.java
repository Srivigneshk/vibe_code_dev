class Solution {
    public int minElement(int[] nums) {
        int[] arr = nums.clone();
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            while(arr[i]>0){
                int digit = arr[i]%10;
                sum+=digit;
                arr[i] = arr[i]/10;
            }
            arr[i] = sum;
            sum = 0;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}