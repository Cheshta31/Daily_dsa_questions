import java.util.Scanner;
public class Recursion_fibonacci {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number =  ");
        n=sc.nextInt();
        Recursion_fibonacci r=new Recursion_fibonacci();
        int ans=r.fun(n);
        System.out.println("Answer = " +ans);
    }
    int fun(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        return (fun(n-1)+fun(n-2));
    }
    
}
