class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // this is two pointer approach
        // as we can change the order too
        int n = nums.length;
        int i = 0, j = n - 1;
        while (i < j) {
            int left = nums[i];
            int right = nums[j];
            if (left % 2 == 1) {
                if (right % 2 == 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
                j--;
            } else {
                i++;
            }
        }
        return nums;
    }
}