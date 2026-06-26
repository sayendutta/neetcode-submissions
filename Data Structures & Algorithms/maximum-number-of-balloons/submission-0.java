class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }
        int bcount = freq['b' - 'a'];
        int acount = freq[0];
        int lcount = freq['l' - 'a']/2; //as there are 2 l's we need to calculate instance
        int ocount = freq['o' - 'a']/2;
        int ncount = freq['n' - 'a'];
        
        return Math.min(bcount, Math.min(acount, Math.min(lcount, Math.min(ocount, ncount))));
    }
}