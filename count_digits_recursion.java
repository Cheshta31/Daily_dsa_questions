import java.util.Scanner;
public class count_digits_recursion {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        int ans=0;
        count_digits_recursion c=new count_digits_recursion();
        ans=c.fun(n);
        System.out.println("Answer = "  +ans);
    }
    int fun(int n)
    {
        if(n<9)
        {
            return 1;
        }
    return fun(n/10)+1;
    }
}
