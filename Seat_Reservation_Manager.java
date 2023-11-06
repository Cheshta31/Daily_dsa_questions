class SeatManager {
    private TreeSet<Integer> seats;

    public SeatManager(int n) {
        seats = new TreeSet();
        for(int i=1;i<=n;i++)
        {
            seats.add(i);
        }

        
    }
    
    public int reserve() {
        return seats.pollFirst();
    }
    
    public void unreserve(int seatNumber) {
        seats.add(seatNumber);
    }
}
