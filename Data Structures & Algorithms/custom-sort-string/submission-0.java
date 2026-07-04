class Solution {
    public String customSortString(String order, String s) {
        Set<Character> order_set = new HashSet<>();
        for(char ch : order.toCharArray())
            order_set.add(ch);
        Map<Character, Integer> freq_s = new HashMap<>();
        StringBuilder end = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(!order_set.contains(ch))
                end.append(ch+"");
            else
                freq_s.put(ch, freq_s.getOrDefault(ch, 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        for(char ch : order.toCharArray()) {
            for(int i = 0; i<freq_s.getOrDefault(ch, 0); i++)
                res.append(ch+"");
        }
        res.append(end);
        return res.toString();
    }
}