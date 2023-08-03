import java.util.Scanner;
class Sieve_of_Eranthonsis {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        if(n==1||n==0)
       { 
        System.out.println("Number is neither prime nor composite ");
       }
       System.out.println("Prime no. less than the number are = ");
       boolean prime[]=new boolean[n+1];
       for(int i=2;i<=n;i++)
       {
        prime[i]=true;
       }
       for(int p=2;p*p<=n;p++)
       {
        if(prime[p]==true)
        {
        for(int i=2*p;i<=n;i=p+i)
        {
            prime[i]=false;
        }
        }
       }
       for(int i=2;i<=n;i++)
       {
        if(prime[i]==true)
        {
            System.out.println(i);
        }
       }



    }

}
