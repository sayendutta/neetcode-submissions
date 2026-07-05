class Solution {
    private boolean isDigit(char ch) {
        //ascii of 0 => 48
        if(ch >=48 && ch<=57)
            return true;
        return false;
    }
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        while(i<word.length() && j<abbr.length()) {
            if(word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
            } else {
                if(!isDigit(abbr.charAt(j)))
                    return false;
                else if(abbr.charAt(j) == '0')
                    return false;//can't have leading zero
                else {
                    //it's a number not starting with 0
                    int sublen = 0;
                    while(j<abbr.length() && isDigit(abbr.charAt(j))) {
                        sublen = sublen * 10 + (abbr.charAt(j) - '0');
                        j++;
                    }
                    i+=sublen;
                }
            }
        }
        return i == word.length() && j == abbr.length();
    }
}