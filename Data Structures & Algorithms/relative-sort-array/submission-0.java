class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // convert arr2 into hashset to speed up searching
        Set<Integer> arr2_set = new HashSet<>();
        for (int num : arr2) arr2_set.add(num);
        Map<Integer, Integer> arr1_freq = new HashMap<>();
        List<Integer> endList = new ArrayList<>();
        //need to count the frequency of elements in arr1
        for (int num : arr1) {
            if (!arr2_set.contains(num))
                endList.add(num);
            else
                arr1_freq.put(num, arr1_freq.getOrDefault(num, 0) + 1);
        }
        Collections.sort(endList);
        List<Integer> res = new ArrayList<>();
        for (int num : arr2) {
            for (int i = 0; i < arr1_freq.get(num); i++) res.add(num);
        }
        res.addAll(endList);
        return res.stream()
               .mapToInt(Integer::intValue)
               .toArray();
    }
}