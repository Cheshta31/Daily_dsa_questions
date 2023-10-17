import java.util.Scanner;
public class Power_using_modulo {
    public static void main(String args[])
    {
        int n;
        int r;
        int ld=0;
        int rn=0;
        int no=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        no=n;
        while(no>0)
        {
            ld=no%10;
            rn=rn*10+ld;
            no=no/10;
        }
        r=rn;
        System.out.println("Answer = " +r);
        Power_using_modulo p = new Power_using_modulo();
        long ans;
        ans=p.fun(n,r);
        System.out.println("Answer = " +ans);
    }
    long fun(int n,int r)
    {
        long a;
        int mod=1000000007;
        if(r==0)
        {
            return 1;
        }
        if(r%2==0)
        {
            a=fun(n,r/2);
            a=(a*a)%mod;
        }
        else
        {
            a=n%mod;
            a=(a*(fun(n,r-1)%mod))%mod;
        }
    return (a)%mod;
    }
}
