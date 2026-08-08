class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> brackets = new Stack<>();
        for(int i = 0; i<n; i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                brackets.push(ch);
            else if(ch == ')') {
                if(brackets.isEmpty())
                    return false;
                else if(brackets.peek() == '(')
                    brackets.pop();
                else
                    return false;
            }
            else if(ch == '}') {
                if(brackets.isEmpty())
                    return false;
                else if(brackets.peek() == '{')
                    brackets.pop();
                else
                    return false;
            }
            else if(ch == ']') {
                if(brackets.isEmpty())
                    return false;
                else if(brackets.peek() == '[')
                    brackets.pop();
                else
                    return false;
            }
        }
        return brackets.isEmpty();
    }
}
