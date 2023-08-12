import java.util.Scanner ;
class Celsius_to_Fraheniet {
    
    public static void main(String args[])
    {
        int c;
        int frah=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celisus = ");
        c=sc.nextInt();
        frah=((9*c)/5)+32;
        System.out.println("Temperature in frahniet will be = " +frah);
    }
}
