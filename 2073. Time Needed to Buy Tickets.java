class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int condition = tickets[k];
        int t = 0;
        while (true) {

            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i] = tickets[i]-1;

                    t++;
                }

                if (i == k && tickets[i] == 0) {
                    return t;
                }
            }

        }

    }
}
