class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        //set maxLeft and maxRight at respective indices
        int leftMax = height[l], rightMax = height[r];
        int res = 0;
        while(l<r) {
            if(leftMax<rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                //holding water at current index
                res+=(leftMax - height[l]);
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                //holding water at current index
                res+=(rightMax - height[r]);
            }
        }
        return res;
    }
}
