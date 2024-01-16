import java.util.Scanner;
public class Efficient_move_zeroes_end {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        n=sc.nextInt();
        System.out.println("Enter the elements = ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        //Efficient_move_zeroes_end o = new Efficient_move_zeroes_end();
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[0]=arr[i];
                arr[i]=arr[count];
                arr[count]=temp[0];
                count++;
            }            
        }
        System.out.println("New Array = ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
