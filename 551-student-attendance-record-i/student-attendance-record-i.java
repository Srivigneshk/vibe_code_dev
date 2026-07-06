class Solution {
    public boolean checkRecord(String s) {
        int n = s.length();
        int countA =0;
        int countL =0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'A'){
                countA++;
            }
            if(s.charAt(i) == 'L'){
                countL++;
            } else {
                countL = 0;
            }
            if(countA >= 2 || countL >= 3){
                return false;
            }
        }
        return true;
    }
}