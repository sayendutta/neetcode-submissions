class Solution {
    public int pivotIndex(int[] nums) {
        //we need prefix and suffix sum array
        int n = nums.length;
        long[] pre = new long[n];
        long[] suff = new long[n];
        for(int i = 1; i<nums.length; i++) {
            pre[i] = pre[i-1] + nums[i-1];
            suff[n-i-1] = suff[n-i] + nums[n-i];
        }
        for(int i = 0; i<n; i++) {
            if(pre[i] == suff[i])
                return i;
        }
        return -1;
    }
}