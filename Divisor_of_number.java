import java.util.Scanner;
class Divisor_of_number {
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        System.out.println("The divisors of this no. are = ");
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
    
}
