class Solution {
    public int compress(char[] chars) {
        //need to use three pointers
        //k -> write to the array
        //i -> read the chars
        //j -> check for repeat elements that are consecutive
        int n = chars.length, i = 0, k = 0;
        while(i<n) {
            chars[k++] = chars[i];
            int j = i + 1;
            while(j<n && chars[j] == chars[i])
                j++;//get the duplicate char count
            if(j - i > 1) {
                String dup = "" + (j - i); //count of repeat character
                for(char c : dup.toCharArray())
                    chars[k++]=c;//inset count char by char like "10"-> '1', '0'
            }
            i = j; // go to next unique character
        }
        return k;
    }
}