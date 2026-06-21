class Solution {
    public int majorityElement(int[] nums) {
        //implementing voting algorithm
        int cnt = 0;
        int majority = nums[0];
        for(int num : nums) {
            if(num == majority) {
                cnt++;
            } else {
                cnt--;
                if(cnt == 0) {
                    majority = num;
                    cnt = 1;
                }
            }
        }
        return majority;
    }
}