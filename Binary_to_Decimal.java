import java.util.Scanner;
public class Binary_to_decimal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        int ans=fun(n);
        System.out.println(ans);
        }    
        static int fun(int n)
{
    if(n==0)
    {
     return 0;
    }
return ((n%2)+10*fun(n/2));    
}

}
