// import java.util.*;

// public class Stock_span {
//     public static void stocs_span(int arr[]) {

//         int span[] = new int[arr.length];
//         int k = 1;
//         for (int i = 0; i < arr.length; i++) {
//             int j = i - 1;
//             while (j >= 0) {
//                 if (arr[j] < arr[i]) {
//                     k++;
//                     j--;
//                 } else {
//                     break;
//                 }
//             }
//             span[i] = k;
//             k = 1;
//         }
//         System.out.println(Arrays.toString(span));
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // System.out.println("enter the sizee of the array");
//         // int n=sc.nextInt();
//         int arr[] = { 13, 15, 12, 14, 16, 8, 6, 4, 10, 30 };
//         // for(int i=0;i<n;i++){
//         // arr[i]=sc.nextInt();
//         // }
//         stocs_span(arr);
//     }
// }
//  SBY STACK IMPLEMENTATION/////
;
import java.util.*;

class Stock_span {
    
    public static void printSpan(int arr[],int n){
        Stack<Integer> s=new Stack<>() ;
        s.add(0);
        System.out.print(1+" ");
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }    
    }
	public static void main (String[] args) {
	
	    int[] arr=new int[]{18,12,13,14,11,16};
        
        printSpan(arr,arr.length);   
	  
	}
	
}
