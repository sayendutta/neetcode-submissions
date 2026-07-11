class Solution {
    public int removeDuplicates(int[] nums) {
        //k -> will overwrite the input array
        int i = 0, k = 0;
        int n = nums.length;
        while(i<n) {
            nums[k++] = nums[i];
            int j = i + 1;
            while(j<n && nums[j] == nums[i]) {
               j++;//fetching duplicate count
            }
            if((j - i) > 1) {
                nums[k++] = nums[i]; //keeping at most 1 duplicate element
            }
            i = j; //i will point to j -> next unique element
        }
        return k;
    }
}