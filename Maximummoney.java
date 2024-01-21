//User function Template for Java
class Solution{
    public int MaxMoney(int M,int []B,int []A)
    {
        // code here
        
        int max=M;
        for(int i=0;i<B.length;i++){
            int buy=M/B[i];
            int num=buy*B[i];
            int rem=M-num;
            int sell=(buy*A[i])+rem;
            max=Math.max(max,sell);
        }
        return max;
    }
}
