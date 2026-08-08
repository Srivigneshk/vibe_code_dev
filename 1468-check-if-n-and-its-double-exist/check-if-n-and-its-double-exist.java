class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i =0;i<arr.length;i++){
            for(int j= 0;j<arr.length;j++){
                if(i!=j){
                    int temp1 = arr[i];
                    int temp2 = 2*arr[j];
                    if(temp1==temp2) return true;
                }
            }
        }
        return false;
    }
}