class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        //just use hashmap
        Map<Integer, Integer> freq = new HashMap<>();
        int n = grid.length;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                freq.put(grid[i][j], freq.getOrDefault(grid[i][j], 0) + 1);
            }
        }
        int missing = 0, dup = 0;
        for(int i = 1; i<=n*n; i++) {
            if(!freq.containsKey(i))
                missing = i;
            else if(freq.get(i) == 2)
                dup = i;
        }
        return new int[]{dup, missing};
    }
}