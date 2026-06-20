class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //we will need to variables
        //consecutive and maxconsecutive
        int consecutive = 0, maxconsecutive = 0;
        for(int num : nums) {
            if(num == 1) {
                consecutive++;
                maxconsecutive = Math.max(maxconsecutive, consecutive);
            } else {
                consecutive = 0;
            }
        }
        return maxconsecutive;
    }
}