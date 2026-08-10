class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
                for(int j = 0; j < n; j++){
                    if(s.charAt(j) == c){
                        int dis = Math.abs(i - j);
                        min = Math.min(min, dis);
                    }
                }
            answer[i] = min;
        }
        return answer;
    }
}