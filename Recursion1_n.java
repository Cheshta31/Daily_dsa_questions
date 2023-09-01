import java.util.Scanner;
public class Print1_n_recursion {
    public static void main(String args[])
    {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number = ");
    n=sc.nextInt();
    Print1_n_recursion r = new Print1_n_recursion();
    r.fun(n);
    }
    void fun(int n)
    {
        if(n==0)
        {
            return ;
        }
        fun(n-1);
        System.out.println(n);
    }

    
}
