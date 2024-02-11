import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
ArrayList<Integer> al=new ArrayList<>();
int max=a[a.length-1];
al.add(a[a.length-1]);
for(int i=a.length-2;i>=0;i--){
    if(a[i]>max){
        max=a[i];
        al.add(max);
    }



}
Collections.sort(al);

return al;

    }
}
