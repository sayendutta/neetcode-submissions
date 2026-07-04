class Solution {
    public void sortColors(int[] nums) {
        //this is counting sort
        int zero = 0, one = 0, two = 0;
        for(int num : nums) {
            switch(num) {
                case 0 -> zero++;
                case 1 -> one++;
                case 2 -> two++;
            }
        }
        for(int i = 0; i<nums.length; i++) {
            if(i<zero)
                nums[i]=0;
            else if(i< zero + one)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }
}