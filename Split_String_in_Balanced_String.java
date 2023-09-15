class Solution {
    public int balancedStringSplit(String s) {
        int res=0;
        int balance=0;
        for(char c : s.toCharArray())
        {
            if(c=='R')
            {
                balance++;
            }
            else if(c=='L')
            {
                balance--;
            }
            if(balance==0)
            {
                res++;
            }
        }
    return res;    
    }
}
