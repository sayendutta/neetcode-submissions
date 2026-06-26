class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //I am thinking of using hashset
        Set<Integer> unique = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int num : nums)
            unique.add(num);
        for(int i = 1; i<=n; i++) {
            if(!unique.contains(i)) //not inset, not in array as well
                ans.add(i);
        }
        return ans;
    }
}