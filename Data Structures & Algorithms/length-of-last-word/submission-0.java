class Solution {
    public int lengthOfLastWord(String s) {
    /*
        we are going to traverser from the right side
        the moment we get a space we break the loop
    */
     int lastWordLen = 0;
     s = s.trim();
     int n = s.length();
     for(int i = n - 1; i>=0; i--) {
        if(s.charAt(i) == ' ')
            return lastWordLen;
        lastWordLen++;
     }
     return lastWordLen;
    }
}