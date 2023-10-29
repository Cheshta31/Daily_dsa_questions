class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if(buckets==0) return 0;
        if(minutesToTest<minutesToDie) return 0;
        if(buckets==1) return 0;
        int numsPig=1;
        while(Math.pow(minutesToTest/minutesToDie + 1,numsPig)<buckets)
        {
            numsPig++;

        }
    return numsPig;
    }
}
