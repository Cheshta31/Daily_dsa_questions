import java.util.Scanner;
public class Factorial_recursion {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        Factorial_recursion r= new Factorial_recursion();
        int ans=r.fun(n);
        System.out.println("Answer = " +ans);
        }
    int fun(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        return (n*fun(n-1));
    }
}
