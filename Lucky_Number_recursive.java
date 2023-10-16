import java.util.Scanner;
public class lucky_Number_recursive {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        lucky_Number_recursive ln=new lucky_Number_recursive();
        boolean ans;
        ans=ln.luc(n);
        System.out.println(n+"is lucky number -> " +ans+ " statement");
    }
    boolean luc(int n)
    {
        int counter = 2;
        if(counter<n)
        {
        return true;
        }
        if(counter%n==0)
        {
        return false;
        }
        int np=0;
        np=n;
        np=np-(n/counter);
        counter++;
    return luc(np);
    }

    
}
