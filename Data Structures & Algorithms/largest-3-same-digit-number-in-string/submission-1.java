class Solution {
    public String largestGoodInteger(String num) {
        //sliding window fixed size
        int i = 0, j = 2;
        int max = 0;
        String ans = "";
        while(j<num.length()) {
            if(num.charAt(i) == num.charAt(j)) {
                if(num.charAt(i) == num.charAt(i+1)) {
                    if((num.charAt(i) - '0') >=max) {
                        max = num.charAt(i) - '0';
                        ans = num.substring(i, j + 1);
                    }
                }
            }
            i++;
            j++;
        }
        return ans;
    }
}