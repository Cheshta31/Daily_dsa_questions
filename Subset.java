import java.util.Scanner;
public class Subset {
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String = ");
        s=sc.nextLine();
        String curr = "";
        int i = 0;
        Subset sub = new Subset();
        sub.fun(s,curr,i);
    }
    void fun(String s,String curr,int i)
    {
        if(s.length()==i)
        {
            System.out.println(curr);
            return;
        }
        fun(s,curr,i+1);
        fun(s,s.charAt(i)+curr,i+1);
    }
}
