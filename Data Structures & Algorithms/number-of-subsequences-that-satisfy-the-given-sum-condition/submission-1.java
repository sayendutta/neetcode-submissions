class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1_000_000_007;
        Arrays.sort(nums);

        int n = nums.length;
        
        //precomputing power array with mmodulo
        int[] pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (int)((pow[i - 1] * 2L) % mod);
        }

        int l = 0, r = n - 1;
        int ans = 0;

        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                ans = (ans + pow[r - l]) % mod;
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}