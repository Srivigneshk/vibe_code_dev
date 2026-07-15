class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0,sumOdd = 0;
        for(int i =1;i<=n*2;i++){
            if(i%2!=0){
                sumOdd += i;
            }else{
                sumEven += i;
            }
        }
        return gcd(sumOdd,sumEven);
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}