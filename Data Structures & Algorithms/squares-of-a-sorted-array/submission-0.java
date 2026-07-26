class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++) {
            if(nums[i] <0)
                nums[i] = (-1) * nums[i];
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}