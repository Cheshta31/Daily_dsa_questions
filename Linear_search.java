import java.util.*;
class Operations_array{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        //searching
        int x;
        System.out.println("Enteer the element");
        x=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("Found at "+(i+1));
            }
        }
    }
}
