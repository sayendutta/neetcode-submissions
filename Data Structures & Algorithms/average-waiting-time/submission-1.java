class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ct = 0.0;
        double wt = 0.0;
        for(int[] customer : customers) {
            int at = customer[0];
            int bt = customer[1];
            ct = Math.max(ct, (double)at);//chef waits if no order
            ct+=bt;
            wt += (ct - at);
        }
        return wt/(customers.length);
    }
}