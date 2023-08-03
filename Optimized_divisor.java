import java.util.Scanner;
class Optimized_divisor {
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        n=sc.nextInt();
        System.out.println("The divisors of this no. are = ");
        for(i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            if(i!=n/i)
            {
                System.out.println(n/i);
            }
            }
        }
    }
    
}
