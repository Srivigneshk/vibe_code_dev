class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int count=0;
        for(char ca : magazine.toCharArray()){
            arr[ca - 'a']++;
        }
        for(char ch : ransomNote.toCharArray()){
            if(arr[ch-'a']==0){
                return false;
            }
            arr[ch-'a']--;
        }
        return true;
    }
}