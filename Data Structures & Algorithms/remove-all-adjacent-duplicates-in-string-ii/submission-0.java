class Pair {
    public char first;
    public int second;
    Pair(char f, int s) {
        this.first = f;
        this.second = s;
    }
}
class Solution {
    public String removeDuplicates(String str, int k) {
        Stack<Pair> s = new Stack<>();
        for (char c : str.toCharArray()) {
            if (!s.isEmpty() && s.peek().first == c) {
                Pair p = s.pop();
                int cnt = p.second + 1;
                if (cnt < k) {
                    s.push(new Pair(c, cnt));
                }
            } else {
                s.push(new Pair(c, 1));
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!s.isEmpty()) {
            Pair p = s.pop();
            char c = p.first;
            int cnt = p.second;
            ans.append(("" + c).repeat(cnt));
        }
        return ans.reverse().toString();
    }
}