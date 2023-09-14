import java.util.Scanner;
public class Pallindrome_recursion {
    public static void main(String args[])
    {
        int start;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string = ");
        String str=sc.nextLine();
        n=str.length();
        int end=0;
        start=0;
        end=n-1;
        Pallindrome_recursion p = new Pallindrome_recursion();
        boolean a;
        a=p.fun(str,start,end);
    System.out.println(a);
    }
    boolean fun(String str,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        return((str.charAt(start)==str.charAt(end))&&fun(str,start+1,end-1));
    }
    
}
