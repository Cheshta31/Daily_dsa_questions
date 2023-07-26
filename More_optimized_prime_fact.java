import java.util.Scanner;
class More_optimized_prime_fact {
    public static void main(String args[])
    {
        int n,i;
        int x=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number =   ");
        n=sc.nextInt();
        System.out.println("Prime factors of this number are = ");
        if(n==1)
        {
            System.out.println("The number is neither prime nor composite");
        }
        while(n%2==0)
        {
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0)
        {
            System.out.println(3);
            n=n/3;
        }
        for(i=5;i<n;i=i+6)
        {
            if(n%i==0||n%(i+2)==0)
            {
                x = i;
            }
            while(n%x==0)
            {
                System.out.println(i);
                n=n/x;
            }
        }

    }
    
}
