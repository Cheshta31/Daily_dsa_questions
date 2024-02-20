public class Solution {
    public static int missingNumber(int []a, int N) {
        // Write your code here.
        //sum of elements
        int sum=0;
        int idxs=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+a[i];
        }
        //sum of indexes
        for(int i=0;i<=N;i++)
        {
            idxs=idxs+i;
        }
        //subtract
        int sub=0;
        sub=idxs-sum;
        return sub;
    }
}
