class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for(String detail : details) {
            int tens = detail.charAt(11) - '0';
            int ones = detail.charAt(12) - '0';
            int age = 10*tens + ones;
            if(age>60)
                cnt++;
        }
        return cnt;
    }
}