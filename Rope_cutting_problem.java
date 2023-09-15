import java.util.*;
import java.io.*;
public class Rope_cutting_problrm {
    public static void main(String args[])
    {
        int n,a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n,a,b,c");
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        Rope_cutting_problrm r = new Rope_cutting_problrm();
        int ans=r.fun(n,a,b,c);
        System.out.println("Answer = " +ans);
    }
    int fun(int n,int a,int b,int c)
    {
        if(n==0)
        {
        return 0;
        }
        if(n<=-1)
        {
        return -1;
        }
        int res;
        res=Math.max(fun(n-a,a,b,c),
        Math.max(fun(n-b,a,b,c),
        fun(n-c,a,b,c)));
        if(res==-1)
        {
        return -1;
        }
        else
        {
        return res+1; 
        }
    }
}
