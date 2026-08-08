class Solution {
    public int minOperations(String[] logs) {
        //what we can do here is have a Stack of strings
        //perform push / pop operations
        //at the end check stack size

        Stack<String> ops = new Stack<>();
        for(String log : logs) {
            String param = log.split("/")[0];
            switch(param) {
                case ".." :
                    if(ops.size()>0)
                        ops.pop();
                    break;
                case "." :
                    break;
                default:
                    ops.push(param);
            }
        }
        return ops.size();
    }
}