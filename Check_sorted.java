import java.util.Scanner;
public class Check_sorted {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements are = ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are = ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        Check_sorted o = new Check_sorted();
        //check whether element is sorted
        boolean f=o.sort(arr,n);
        if(f==true)
        {
        System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
    boolean sort(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    return false;
                }
            }
        }
        return true;
}
}
