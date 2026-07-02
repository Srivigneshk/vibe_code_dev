class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        int r = numRows;
        if (r == 1) {
            return s;
        } 
        else {
            StringBuilder[] arr = new StringBuilder[r];
            for (int i = 0; i < r; i++) {
                arr[i] = new StringBuilder();
            }
            int curRow = 0;
            boolean goingDown = false;
            for (int i = 0; i < n; i++) {
                arr[curRow].append(s.charAt(i));
                if (curRow == 0 || curRow == r - 1) {
                    goingDown = !goingDown;
                }
            curRow += goingDown ? 1 : -1;
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < r; i++) {
                result.append(arr[i]);
            }
            return result.toString();
        }
    }
}