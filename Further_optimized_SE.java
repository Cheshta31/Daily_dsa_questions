import java.util.Scanner;
class Further_optimization_SE {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        System.out.println("The prime no. less than the no. are = ");
        boolean prime[]=new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            prime[i]=true;
        }
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
                for(int j=i*i;j<=n;j++)
                {
                     prime[i]=false;
                }
            }
        }
    }
    static   boolean isPrime(int i)
        {
            for(int p=2;p*p<=i;p++)
            {
                if(i%p==0)
                return false;
            }
        return true;
        }
    
}
