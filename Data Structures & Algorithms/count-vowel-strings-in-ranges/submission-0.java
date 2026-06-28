class Solution {
    private boolean isVowel(char ch) {
        switch(ch) {
            case 'a' :
                return true;
            case 'e' :
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
        }
        return false;
    }
    private boolean isStartEndVowel(String word) {
        if(isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1)))
            return true;
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
       
        for(int i = 0; i<queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            for(int k = li; k<=ri; k++) {
                if(isStartEndVowel(words[k]))
                    ans[i]++;
            }
        }
        return ans;
    }
}