class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int child = g.length;
        int cookie = s.length;
        int max = 0,i=0,j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<child && j<cookie){
            if(g[i]<=s[j]){
                max++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return max;
    }
}