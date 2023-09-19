import java.util.Scanner;
public class Josephus_problem {
    public static void main(String args[])
    {
        int n=0;
        int k=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no. of people = ");
    n=sc.nextInt();
    System.out.println("Enter the term which has to be killed = ");
    k=sc.nextInt();
    Josephus_problem j = new Josephus_problem();
    int ans;
    ans = j.jos(n,k);
System.out.println("Answer = " +ans);    
}
int jos(int n,int k)
{
    if(n==1)
    {
return 0;
    }
    return (jos(n-1,k)+k)%n;
}

    
}
