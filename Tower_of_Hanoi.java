import java.util.Scanner;
public class Tower_of_Hanoi {
    public static void main(String args[])
    {
        int n;
        char A;
        char B;
        char C;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of disks = ");
        n=sc.nextInt();
        Tower_of_Hanoi toh = new Tower_of_Hanoi();
        toh.fun(n,'A','B','C');
    }
    void fun(int n,char A,char B,char C)
    {
        if(n==1)
        {
            System.out.println("Move 1 disk from " +A+ " to " +C);
            return;
        }
        fun(n-1,A,C,B);
        System.out.println("Move " +n+ " from " +A+ " to " +C);
        fun(n-1,B,A,C);

    }
    
}
