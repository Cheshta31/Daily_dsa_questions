import java.util.Scanner;
public class Printn_1_recursion {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        Printn_1_recursion r = new Printn_1_recursion();
        r.fun(n);
    }
    void fun(int n)
    {
        if(n==0)
        {
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }
}
