class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<Integer>();
        long res=1;
        //int a=1;
        //int mod=1000000007;
        int row=rowIndex+1;
        ans.add(1);
        for(int i=1;i<row;i++)
        {
            res=res*(row-i);
            res=res/i;
            //res=res%mod;
            ans.add((int)res);
        }
        return ans;
        
    }
}
