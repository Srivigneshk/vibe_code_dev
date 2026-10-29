class Solution {
    public int findSpecialInteger(int[] arr) {
        int max = 0, count = 1,num = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
                if(count>max) {
                    max = count;
                    num = arr[i]; 
                } 
            } else {
                count =1 ;
            }
        }
        return max > arr.length/4 ? num : arr[0];
    }
}