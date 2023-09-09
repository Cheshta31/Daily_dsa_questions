import java.util.Scanner;
public class Sum_of_natural_no {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        Sum_of_natural_no s = new Sum_of_natural_no();
        int ans=s.fun(n);
        System.out.println("Answer = " +ans);
    }
    int fun(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n+fun(n-1));
    }
}
