class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int iIndex = 0, dIndex = n;
        char[] arr = s.toCharArray();
        int[] res = new int[n+1];
        for(int i=0;i<n;i++){
            if(arr[i]=='I'){
                res[i] = iIndex;
                iIndex++;
            }
            if(arr[i]=='D'){
                res[i] = dIndex;
                dIndex--;
            } 
        }
        res[n] = iIndex;
        return res;
    }
}