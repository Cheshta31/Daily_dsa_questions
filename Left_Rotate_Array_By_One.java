import java.util.Scanner;
public class Left_rotate_array_by_one {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number = ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array = ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //int temp[n]=new int[n];
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println("Array will be = ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
