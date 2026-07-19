class Solution {
    public void moveZeroes(int[] nums) {
        // here I can use the two pointer approach
        int n = nums.length;
        // we have to miantain relative order of elements too
        int k = 0; //k will update nums array
        for(int i = 0; i<n; i++) {
            if(nums[i] !=0) {
                //whenever you encounter non-zero value
                //swap the insert position with cureent value
                //insert position will always increment by 1
                //so the nums array will have consecutive non zero elements only
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
    }
}