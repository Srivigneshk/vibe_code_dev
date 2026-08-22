class Solution {
    public boolean checkDivisibility(int n) {
        int dSum = 0,dprod = 1;
        int original = n;
        int temp = n;
        while(temp>0){
            int digit = temp%10;
            dSum+=digit;
            temp = temp/10;
        }
        while(n>0){
            int d = n%10;
            dprod*=d;
            n = n/10;
        }
        if(original % (dSum + dprod) == 0){
            return true;
        }
        return false;
    }
}