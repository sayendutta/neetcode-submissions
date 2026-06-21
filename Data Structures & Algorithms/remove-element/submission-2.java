class Solution {
    public int removeElement(int[] nums, int val) {
        // going for a two pointer approach
        // i and j -> i starts from start, j starts from end
        // if i points to val and j points to !=val, swap
        // both points to val, keep i at place move j forward towards i
        // i points to !=val, j points to val -> do nothing just move i

        int i = 0, j = nums.length - 1;
        while (i < j) {
            if(nums[i]==val) {
                if(nums[j]!=val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
                j--;
            } else {
                i++;
                //no need to move j as j points to correct position
            }
        }
        int cnt = 0;
        for(int num : nums) {
            if(num == val)
                return cnt;
            cnt++;
        }
        return cnt;
    }
}