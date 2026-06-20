class Solution {
    public int appendCharacters(String s, String t) {
        int m = t.length();
        int n = s.length();
        int i = 0, j = 0;
        while(i<m && j<n) {
            if(t.charAt(i) == s.charAt(j))
                i++;
            j++;
        }
        return (m - i);
    }
}