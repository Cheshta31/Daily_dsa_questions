class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int paper = 0;
        int glass = 0;
        int metal = 0;
        int time = 0;
        for(int i=0;i<garbage.length;i++)
        {
            for(int j=0;j<garbage[i].length();j++)
            {
                if(garbage[i].charAt(j)=='P') paper=i;
                else if(garbage[i].charAt(j)=='G') glass=i;
                else if(garbage[i].charAt(j)=='M') metal=i;
                time++;
            }
        }
        for(int i=1;i<travel.length;i++)
        {
            travel[i] += travel[i-1];
        }
        time += paper == 0 ? 0 : travel[paper-1];
        time += glass == 0 ? 0 : travel[glass-1];
        time += metal == 0 ? 0 : travel[metal-1];
    return time;
        
    }
}
