
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long g=gcd(A,B);
        long lcm = (A*B)/g;
        Long ans[] = new Long[2];
        ans[0]=lcm;
        ans[1]=g;
        return ans;
    }
    static long gcd(long A,long B)
    {
        while(A>0 && B>0)
        {
            if(A>B)
            {
                A=A%B;
            }
            else
            {
                B=B%A;
            }
        }
        return (A==0) ? B : A;
    }
};
