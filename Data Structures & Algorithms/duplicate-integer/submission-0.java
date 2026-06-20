class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            if(!freq.containsKey(num)) {
                freq.put(num, 1); //nno need to count frequency, just put it into map
            } else {
                return true; //as the number already present
            }
        }
        return false;
    }
}