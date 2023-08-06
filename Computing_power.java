import java.util.Scanner;
class Computing_power {
    public static void main(String args[])
    {
        int n,x;
        int i;
        int res=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        System.out.println("Enter the power to be calculated = ");
        x=sc.nextInt();
        if(x==0)
        {
            System.out.println("1");
        }
        for(i=1;i<=x;i++)
        {
            res=res*n;
        }
        System.out.println("Answer = " +res);
    }
    
}
