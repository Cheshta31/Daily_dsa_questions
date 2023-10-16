import java.util.Scanner;
public class power_recursion {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        System.out.println("Enter the power = ");
        r=sc.nextInt();
        power_recursion p = new power_recursion();
        int ans;
        ans=p.pr(n,r);
        System.out.println("Answer = " +ans);
       
    }
    int pr(int n,int r)
    {
        if(r==0)
        {
            return 1;
        }
    return n*pr(n,r-1);
    }
    
}
