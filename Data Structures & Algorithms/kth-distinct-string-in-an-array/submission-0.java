class Solution {
    public String kthDistinct(String[] arr, int k) {
        //we can use a hashmap to check for uniqueness
        //now go to every string in the array, and if the freq is 1
        //track a count
        //if count == k, then return that string
        //else return ""
        Map<String, Integer> freq = new HashMap<>();
        for(String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        int cnt = 0;
        for(String s : arr) {
            if(freq.get(s) == 1) {
                cnt++;
                if(cnt == k)
                    return s;
            }
        }
        return "";
    }
}