class Solution {
    public int maxScore(String s) {
        //going to calculate 1-count
        //now for each index we will consider the score
        //return the max score
        int ones = 0;
        for(char ch : s.toCharArray()) {
            if(ch=='1')
                ones++;
        }
        int scoreLeft = 0, scoreRight = ones;
        int maxScore = 0;
        //as we are splitting need to go till 2nd last character
        for(int i = 0; i<s.length() - 1; i++) {
            char ch = s.charAt(i);
            if(ch == '0')
                scoreLeft++;
            else
                scoreRight--;
            maxScore = Math.max(maxScore, scoreLeft + scoreRight);
        }
        return maxScore;
    }
}