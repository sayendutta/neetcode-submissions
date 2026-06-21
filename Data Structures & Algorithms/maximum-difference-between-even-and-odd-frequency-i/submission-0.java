class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int oddMax = 0;
        int evenMin = s.length();
        for(int val : freq) {
            if(val > 0) {
                if(val%2 == 1)
                    oddMax = Math.max(oddMax, val);
                else
                    evenMin = Math.min(evenMin, val);
            }
        }
        //max diff is oddMax - evenMin
        return oddMax - evenMin;
    }
}