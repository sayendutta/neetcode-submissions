class Solution {
    public boolean isIsomorphic(String s, String t) {
        // two maps will be required forward and reverse

        int m = s.length();
        int n = t.length();
        if (m != n)
            return false;
        Map<Character, Character> forward = new HashMap<>();
        Map<Character, Character> reverse = new HashMap<>();
        for (int i = 0; i < m; i++) {
            char current = s.charAt(i);
            char value = t.charAt(i);
            if (!forward.containsKey(current)) {
                // when the map doesn't exist in forward
                if (!reverse.containsKey(value)) {
                    //doesn't exist in reverse map
                    //then put in both map
                    forward.put(current, value);
                    reverse.put(value, current);
                } else {
                    if (reverse.get(value) == current) {
                        //value points to same key
                        //put in forward
                        forward.put(current, value);
                    } else {
                        return false;
                    }
                }
            } else {
                if(forward.get(current) == value) {
                    //same key points to value
                    //put it in reverse map
                    reverse.put(value, current);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}