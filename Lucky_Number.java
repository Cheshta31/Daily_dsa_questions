import java.util.Scanner;
public class Lucky_Number{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number = ");
       n=sc.nextInt();
       boolean ans;
       Lucky_Number l = new Lucky_Number();
       ans=l.ln(n);
       System.out.println("Answer = " +ans);
    }
    boolean ln(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            n=n-(n/i);
        }
    return true;

    }
}
