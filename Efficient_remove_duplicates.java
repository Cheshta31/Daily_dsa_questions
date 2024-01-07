import java.util.*;
public class Efficient_remove_duplicates {
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
        int res=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[res-1])
            {
                arr[res]=arr[i];
                res++;
            }
        }
        System.out.println("Remove duplicates from array = ");
        for(int i=0;i<res;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
