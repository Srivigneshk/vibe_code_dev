class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 == 0) even.add(digit);
            else odd.add(digit);
        }
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even, Collections.reverseOrder());
        int o = 0, e = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 == 0) result = result * 10 + even.get(e++);
            else result = result * 10 + odd.get(o++);
        }
        return result;
    }
}