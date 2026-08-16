class Pair {
    int ind, val;
    Pair(int ind, int val) {
        this.ind = ind;
        this.val = val;
    }
    public int getInd() {
        return this.ind;
    }
    public int getVal() {
        return this.val;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     //Monotonic decreseing stack
     Stack<Pair> s = new Stack<>();
     int n = temperatures.length;
     int[] ans = new int[n];
     for(int i = 0; i<n; i++) {
        while(!s.isEmpty() && temperatures[i] > s.peek().getVal()) {
            int ind = s.peek().getInd();
            int val = s.peek().getVal();
            ans[ind]=i-ind;
            s.pop();
        }
        s.push(new Pair(i, temperatures[i]));
     }
     return ans;  
    }
}
