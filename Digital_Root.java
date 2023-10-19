import java.util.Scanner;
public class Digital_root {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        Digital_root d = new Digital_root();
        int ans;
        ans=d.fun(n);
        System.out.println("Answer = " +ans);
        
    }
    int fun(int n)
    {
        int res=0;
        if(Integer.toString(n).length()==1)
        {
            return n;
        }
        for(char c:Integer.toString(n).toCharArray())
        {
            res += Character.getNumericValue(c);
        }
    return fun(res);
    }
}
