class Solution {
    private int findMinLength(String[] strs) {
        int minLen = strs[0].length();
        int n = strs.length;
        for (int i = 1; i < n; i++) minLen = Math.min(minLen, strs[i].length());
        return minLen;
    }
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int min = findMinLength(strs);
        // I have to check if strs[i][j] ==strs[i+1][j] == strs[i+2][j] ...
        // i will loop from 0 to strs.length - 1
        // j will loop from 0 to min
        for (int j = 0; j < min; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    if (j == 0)
                        return "";
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0].substring(0, min);//after all character match
    }
}