class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        //it's normal problem
        //just compare left and curr
        //if both equal then resent increasing and decreasing counter
        //if increasing increment inc counter
        //else if decresing, decrement dec counter
        int res = 1, inc = 1, dec = 1;
        int n = nums.length;
        for(int i = 1; i<n; i++) {
            int curr = nums[i];
            int left = nums[i-1];
            if(curr == left) {
                inc = 1;
                dec = 1;
            }
            else if(curr > left) {
                inc++;
                dec = 1;
            }
            else {
                dec++;
                inc = 1;
            }
            res = Math.max(res, Math.max(inc, dec));
        }
        return res;
    }
}