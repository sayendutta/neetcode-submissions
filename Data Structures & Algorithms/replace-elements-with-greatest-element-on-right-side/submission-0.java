class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = arr[n-1];
        int[] out = new int[n];
        for(int i = n - 1; i>=0; i--) {
            if(i==n-1)
                out[i]=-1;
            else {
                maxRight = Math.max(arr[i+1], maxRight);//maxRight contains max right running
                out[i] = maxRight;
            }
        }
        return out;
    }
}