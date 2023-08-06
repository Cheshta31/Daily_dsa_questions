import java.util.Scanner;
class Iterative_power {
    public static void main(String args[])
    {
        int n,x;
        int res=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        System.out.println("Enter the power = ");
        x=sc.nextInt();
        while(x>0)
        {
            if(x%2!=0)
            {
            res=res*n;
            }
            n=n*n;
            x=x/2;
        }
        System.out.println("Answer = " +res);
    }    
    
}
