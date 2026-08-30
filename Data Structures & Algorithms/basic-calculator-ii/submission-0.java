class Solution {
    public int calculate(String s) {
        s = s.replace(" ", "");
        char op = '+';
        int num = 0; // intermediate result
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
                num = num * 10 + (ch - '0'); // building num
            if (!Character.isDigit(ch) || i == s.length() - 1) {
                // evaluating based on last operator
                // as we can't evaluate current operator right now
                if (op == '+')
                    stack.push(num);
                else if (op == '-')
                    stack.push(-1 * num);
                else if (op == '*') {
                    stack.push(stack.pop() * num);
                } else {
                    stack.push(stack.pop() / num);
                }
                op = ch; //current operator updated
                num = 0; //reset number as we encountered operator
            }
        }
        int res = 0;
        while (!stack.isEmpty()) res += stack.pop();
        return res;
    }
}