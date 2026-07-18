class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1); // reverse  entire array
        reverse(nums, 0, k - 1); // reverse first k elememnts to get their org porder
        reverse(nums, k , n - 1); //get org order for remianing elements
    }
    private void reverse(int[] nums, int low, int high) {
        while(low<=high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        } 
    }
}