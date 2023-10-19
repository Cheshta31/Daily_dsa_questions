import java.util.*;
public class Phone_Number_Characters {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of phone number = ");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements = ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Phone_Number p = new Phone_Number();
        ArrayList<String> s = new ArrayList<String>();
         s=p.fun(arr,n);
         for(String i : s) {
        System.out.println("Answer = " +i);
    }
}
    ArrayList<String> fun(int arr[],int n)
    {
        ArrayList<String> res = new ArrayList<String>();
        if(n==0)
        {
            return res;
        }
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        backtrack(arr,0,map,new StringBuilder(),res);
        {
            return res;
        }

    }
    void backtrack(int arr[],int i,HashMap<Integer,String> map,StringBuilder sb,List<String> res) 
    {
        if(sb.length()==arr.length)
        {
            res.add(sb.toString());
            return ;
        }
        String currEle = map.get(arr[i]);
        for(int j=0;j<currEle.length();j++)
        {
            sb.append(currEle.charAt(j));
        }
        backtrack(arr,i+1,map,sb,res);
        sb.deleteCharAt(sb.length()-1);

    }
}
