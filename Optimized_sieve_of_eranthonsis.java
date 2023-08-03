import java.util.Scanner;
class Optimization_sieve_erathnosis {
    public static void main(String args[])
    {
        int n;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        if(n==0||n==1)
        {
            System.out.println("The no. is neither prime nor composite");
        }
        System.out.println("The prime no. less than the no. are = ");
        boolean prime[]=new boolean[n+1];
        for(i=0;i<=n;i++)
        {
            prime[i]=true;

        }
        for(int p=2;p*p<=n;p++)
        {
            if(prime[p]==true)
            {
            for(i=p*p;i<=n;i=i+p)
            {
                prime[i]=false;
            }
        }
        }
        for(i=2;i<=n;i++)
        {
            if(prime[i]==true)
            {
                System.out.println(i);
            }
        }
    }
    
}
