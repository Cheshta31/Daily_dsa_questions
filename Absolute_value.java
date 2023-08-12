import java.util.Scanner;
class Absolue_value{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number = ");
n=sc.nextInt();
if(n==0)
{
    System.out.println("Absolute value = 0 ");
}
else if(n>0)
{
    System.out.println("Absolute value = " +n);
}
else 
{
    int res=0;
    res=-1*n;
    System.out.println("Absolute value = " +res);
}
}
}
