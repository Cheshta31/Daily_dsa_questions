import java.util.Scanner;
class Prime_no_less_than_no {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. = ");
        n=sc.nextInt();
        System.out.println("The prime no. less than the no. are = ");
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int i)
        {
           for(int j=2;j<i;j++)
           {
            if(i%j==0)
            {
                return false;
            }
           }
        return true;
        }
}
