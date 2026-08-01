class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0, right = n - 1;
        int maxarea = 0;
        while(left < right) {
            int area = (right - left) * Math.min(heights[left], heights[right]);
            maxarea = Math.max(area, maxarea);
            //moving towards bigger bar always
            if(heights[left] > heights[right])
                right--;
            else
                left++;
        }
        return maxarea;
    }
}
