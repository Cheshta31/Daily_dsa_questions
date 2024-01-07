import java.util.*;
public class Remove_duplicates {
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
        int temp[]=new int[n];
        int res=1;
        temp[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            if(temp[res-1]!=arr[i])
            {
                temp[res]=arr[i];
                res++;
            }

        }
        for(int i=0;i<res;i++)
        {
            arr[i]=temp[i];
        }
        System.out.println("Unique elements present in array are = " +res);
        System.out.println("Elements are = ");
        for(int i=0;i<res;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
