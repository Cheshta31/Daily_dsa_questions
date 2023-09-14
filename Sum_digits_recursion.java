import java.util.Scanner;
public class Sum_digits_recursion {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        Sum_digits_recursion r = new Sum_digits_recursion();
        int ans=r.fun(n);
        System.out.println("Answer = " +ans);
    }
    int fun(int n)
    {
        if(n==0)
        {
        return 0;
        }
    return fun(n/10)+n%10;
    }
}
