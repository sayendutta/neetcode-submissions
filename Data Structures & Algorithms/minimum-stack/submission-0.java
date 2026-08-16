class Pair {
    int val, minVal;
    Pair(int val, int minVal) {
        this.val = val;
        this.minVal = minVal;
    }
    public int getMinVal() {
        return this.minVal;
    }
    public int getVal() {
        return this.val;
    }
}
class MinStack {
    //idea is to have min element for each of the inserted element
    Stack<Pair> minStack;
    public MinStack() {
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(!minStack.isEmpty()) {
            minStack.push(new Pair(val, Math.min(minStack.peek().getMinVal(), val)));
        } else {
            minStack.push(new Pair(val, val));
        }
    }
    
    public void pop() {
        minStack.pop();
    }
    
    public int top() {
        return minStack.peek().getVal();
    }
    
    public int getMin() {
        return minStack.peek().getMinVal();
    }
}
