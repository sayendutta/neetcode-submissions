class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int runningSum = nums[0];
        for(int i = 1; i<nums.length; i++) {
            if(nums[i] == nums[i-1] || nums[i-1] > nums[i])
                runningSum = nums[i]; //reset to current element value as new seq. starts
            else {
                runningSum+=nums[i];
                maxSum = Math.max(runningSum, maxSum);
            }
        }
        return maxSum;
    }
}