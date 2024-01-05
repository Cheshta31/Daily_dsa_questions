import java.util.*;
public class Efficient_second_largest {
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
        System.out.println("Array elements are = ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        //second largest
        int largest=0;
        int res=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[largest])
            {
                res=largest;
                largest=i;
            }
            else if(arr[i]<arr[largest])
            {
                if(res==-1||arr[i]>arr[res])
                {
                    res=i;
                }
            }
        }
        System.out.println("Second Largest Element = " +arr[res]);
    }
}
