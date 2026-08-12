class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int totalTime = 0;
        int targetTickets = tickets[k];
        
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                // People in front of k (and k itself) can buy up to targetTickets
                totalTime += Math.min(tickets[i], targetTickets);
            } else {
                // People behind k can buy at most targetTickets - 1
                totalTime += Math.min(tickets[i], targetTickets - 1);
            }
        }
        
        return totalTime;
    }
}
