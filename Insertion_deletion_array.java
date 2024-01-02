import java.util.*;
class Insertion_deletion_array
{
    public static void main(String args[])
    {
        int size,x,pos;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        size=sc.nextInt();
        int arr[]=new int();
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt()
        }
        System.out.println("Array elements are = ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element and position at which it is to be entered");
        x=sc.nextInt();
        pos=sc.nextInt();
        int ind=pos-1;
        for(int i=size-1;i>=ind;i--)
        {
            arr[i+1]=arr[i];
            arr[ind]=arr[x];
        }
        System.out.println("Array elements are = ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
