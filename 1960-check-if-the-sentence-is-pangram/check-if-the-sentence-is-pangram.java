class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] alph = {
            'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','o','p','q','r','s','t',
            'u','v','w','x','y','z'
        };
        for (int i = 0; i < 26; i++) {
            if (!sentence.contains(String.valueOf(alph[i]))) {
                return false;
            }
        }
        return true;
    }
}