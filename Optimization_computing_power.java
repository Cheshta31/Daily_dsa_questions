import java.util.Scanner;
class Optimization_computing_power {
    public static void main(String args[])
    {
        int n,x;
        int res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number = ");
        n=sc.nextInt();
        System.out.println("Enter the power = ");
        x=sc.nextInt();
        Optimization_computing_power cp=new Optimization_computing_power();
        res=cp.power(n,x);
        System.out.println("Answer = " +res);
    }
        int power(int n,int x)
        {
            int temp=1;
            if(x==0)
            {
                return 1;
            }
            temp=power(n,x/2);
            temp = temp*temp;
            if(x%2==0)
            {
                return temp;
            }
            else
            {
                return temp*n;
            }
        }


    
}
