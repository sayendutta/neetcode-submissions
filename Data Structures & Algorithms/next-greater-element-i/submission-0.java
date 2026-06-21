class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Monotonic Stack solution
        //map is used to form the result array
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Find next greater element for each number in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            int nextGreater = stack.isEmpty() ? -1 : stack.peek();
            nextGreaterMap.put(nums2[i], nextGreater);

            stack.push(nums2[i]);
        }

        // Build answer for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }
}