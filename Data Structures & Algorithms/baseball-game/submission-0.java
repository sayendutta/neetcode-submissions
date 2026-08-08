class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        int x1 = 0, x2 = 0, x3 = 0;
        for (String op : operations) {
            switch (op) {
                case "+":
                    x1 = record.pop();
                    x2 = record.pop();
                    record.push(x2);
                    record.push(x1);
                    record.push(x1 + x2);
                    break;
                case "D":
                    x3 = record.peek();
                    record.push(2 * x3);
                    break;
                case "C":
                    record.pop();
                    break;
                default:
                    record.push(Integer.parseInt(op));
            }
        }

        int ans = 0;
        while(!record.isEmpty()) 
            ans+=record.pop();
        return ans;
    }
}