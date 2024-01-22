import java.util.*;
public class Left_Rotate_Array_by_D {
    public static void main(String args[])
    {
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements = ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the no. to which rotation has to be done");
        d=sc.nextInt();
        Left_Rotate_Array_by_D o = new Left_Rotate_Array_by_D();
        o.left_d(arr,size, d);
        System.out.println("New array will be = ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void left_d(int arr[],int size,int d)
    {
        for(int i=1;i<=d;i++)
        {
            left_one(arr,size);
        }
    }
    void left_one(int arr[],int size)
    {
        int temp=arr[0];
        for(int j=1;j<size;j++)
        {
            arr[j-1]=arr[j];
        }
        arr[size-1]=temp;
    }
}
