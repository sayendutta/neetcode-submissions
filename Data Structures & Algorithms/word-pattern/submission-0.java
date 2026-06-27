class Solution {
    public boolean wordPattern(String pattern, String s) {
        //two hashmaps are needed forward and reverse
        Map<String, Character> forward = new HashMap<>();
        Map<Character, String> reverse = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length)
            return false; //as bijection not possible
        for(int i = 0; i<words.length; i++) {
            String word = words[i];
            char curr = pattern.charAt(i);
            if(forward.containsKey(word)) {
                //forward mapping exists
                if(forward.get(word) != curr) {
                    //forward mapping mismatch
                    return false;
                } else {
                    //forward mapping matches
                    if(reverse.containsKey(curr)) {
                        if(!reverse.get(curr).equals(word)) {
                            //mapping mismatch
                            return false;
                        }
                    }
                    else {
                        reverse.put(curr, word); //update reverse mapping
                    }
                }
            } else {
                if(!reverse.containsKey(curr)) {
                    //mapping doesn't exist
                    reverse.put(curr, word);
                    forward.put(word, curr);
                } else {
                    if(!reverse.get(curr).equals(word)) {
                        //mapping mismatch
                        return false;
                    } else {
                        forward.put(word, curr);
                    }
                }
            }
        }
        return true;
    }
}