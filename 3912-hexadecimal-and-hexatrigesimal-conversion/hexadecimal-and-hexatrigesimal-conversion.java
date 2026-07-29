class Solution {
    public String concatHex36(int n) {
        long square = (long) n * n;
        long cube = (long) n * n * n;
        String hex = Long.toHexString(square).toUpperCase();
        String hexTri = Long.toString(cube, 36).toUpperCase();
        return hex+hexTri;
    }
}