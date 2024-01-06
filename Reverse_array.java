import java.util.Scanner;
public class Reverse_array {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //reverse an array
        int low=0;
        int high=n-1;
        int temp=0;
        while(low<high)
        {
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        System.out.println("Reverse array = ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
