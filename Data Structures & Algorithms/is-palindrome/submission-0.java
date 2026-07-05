class Solution {
    public boolean isPalindrome(String s) {
        //same as reverse string, however instead of swapping
        //compare with equal ignore case
        int i = 0, j = s.length() - 1;
        //however we need to ignore alphanumeric characters
        s = s.toLowerCase();
        while(i<j) {
            //ignore non-alphanumeric characters
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }
}
