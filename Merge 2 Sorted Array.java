https://www.codingninjas.com/studio/problems/sorted-array_6613259?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=SUBMISSION

import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
ArrayList<Integer> al=new ArrayList<>();
int i=0,j=0;

while(i<a.length && j<b.length){
if( a[i]<=b[j] )
{
    if(al.size()==0||al.get(al.size()-1)!=a[i]){
    al.add(a[i]);
    }
    i++;
    
}
else {
   if (al.size()==0||al.get(al.size()-1)!=b[j]){
    al.add(b[j]);
   }
    j++;
    
}

}
for(int k=i;k<a.length;k++){
    if(al.get(al.size()-1)!=a[k])
al.add(a[k]);
}
for(int k=j;k<b.length;k++){
    if(al.get(al.size()-1)!=b[k])
al.add(b[k]);
}
return al;
        
    }
}
