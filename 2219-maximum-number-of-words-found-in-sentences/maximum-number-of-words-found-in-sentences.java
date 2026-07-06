class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int words = sentence.split(" ").length;
            if (words > max) {
                max = words;
            }
        }
        return max;
    }
}