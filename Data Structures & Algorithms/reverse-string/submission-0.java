class Solution {
    public void reverseString(char[] s) {
        //classic two pointers
        //left at 0, right at the last
        //swap till left<right
        int left = 0, right = s.length - 1;
        while(left<right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}