import java.util.Scanner;
class Primality_Test {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        if(n==1||n==0)
        {
            System.out.println("The no. is niether prime nor composite");

        }
        int count=0;
        for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                    break;

                }
            }
                    System.out.println("The number is not prime ");
            if(count==0)
            {
                    System.out.println("The noo. is prime ");
        
            }


    }
    
}
