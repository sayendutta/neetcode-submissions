class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int val1 = 0, val2 = 0;
        for(String token : tokens) {
            switch(token) {
                case "+" :
                    val2 = st.pop();
                    val1 = st.pop();
                    st.push(val1 + val2);
                    break;
                case "-" :
                    val2 = st.pop();
                    val1 = st.pop();
                    st.push(val1 - val2);
                    break;
                case "*" :
                    val2 = st.pop();
                    val1 = st.pop();
                    st.push(val1 * val2);
                    break;
                case "/" :
                    val2 = st.pop();
                    val1 = st.pop();
                    st.push(val1 / val2);
                    break;
                default:
                    st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
