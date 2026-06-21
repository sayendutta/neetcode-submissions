class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            // we need to check both left and right
            int left = (i == 0) ? 0 : flowerbed[i - 1];
            int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
            if (left == 0 && right == 0) {
                if(flowerbed[i] == 1)
                    continue;//already placed so skip it
                // no neighbouring bed has flower
                if (n > 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }
        return n == 0;
    }
}