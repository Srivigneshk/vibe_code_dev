class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        HashMap<Integer, String> rankMap = new HashMap<>();
        int n = sorted.length;
        for (int i = n - 1; i >= 0; i--) {
            int rank = n - i;
            if (rank == 1) {
                rankMap.put(sorted[i], "Gold Medal");
            } else if (rank == 2) {
                rankMap.put(sorted[i], "Silver Medal");
            } else if (rank == 3) {
                rankMap.put(sorted[i], "Bronze Medal");
            } else {
                rankMap.put(sorted[i], String.valueOf(rank));
            }
        }
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }
        return result;
    }
}