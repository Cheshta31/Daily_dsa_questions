import java.util.*;
public class Efficient_check_sorted {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements = ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements = ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        //sorted array
        Efficient_check_sorted o = new Efficient_check_sorted();
        boolean flag;
        flag=o.sorted(arr,n);
        System.out.println("Array is sorted -> " +flag);
    }
    boolean sorted(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
        return true;
        }
    }
}
