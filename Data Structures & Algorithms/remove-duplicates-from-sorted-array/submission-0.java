class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int prev = nums[k];
        for(int i = 1; i<nums.length; i++) {     
            if(nums[i] != prev) {
                //if current element is not same as prev
                //update prev to current
                prev = nums[i];
                //store element at insert position
                nums[++k] = nums[i];
            }
        }
        return k + 1;
    }
}