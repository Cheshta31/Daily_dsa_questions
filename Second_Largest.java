import java.util.Scanner;
public class Second_largest {
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
        System.out.println("Array elements = ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        Second_largest o = new Second_largest();
        //second largest
        int largest=o.getlarge(arr,n);
        int res=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[largest]!=arr[i])
            {
                if(res==-1)
                {
                res=i;
                }
            if(arr[i]>arr[res])
            {
                res=i;
            }
        }
        }
        System.out.println("Second largest element = " +arr[res]);

    }
    int getlarge(int arr[],int n)
    {
        int largest=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[largest])
            {
                largest=i;
            }
        }
        System.out.println("Largest element = "+arr[largest]);
    return largest;
    }
    
}
