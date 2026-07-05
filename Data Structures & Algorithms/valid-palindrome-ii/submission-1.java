class Solution {
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0, j = s.length() - 1;
        int deleteCnt = 0;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                // there are two possibilities
                // go either left side check i+1, j
                // or go towards right i, j - 1
                // if both returns false, there's no way
                // don't go for greedy approach here
                // as it might give you wrong answer going forward
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;
    }
}