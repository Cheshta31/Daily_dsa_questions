
import java.util.Stack;

public class Previous_greater_element {
    
            public static  void previous_greater(int arr[]){
                Stack<Integer> s=new Stack<>();
                    s.push(arr[0]);
                       System.out.print("-1"+" ");
                    for(int i=1;i< arr.length;i++ ){
                            while(s.isEmpty()==false && s.peek()<=arr[i]){
                                s.pop();
                            }

                    int pg= s.isEmpty()?-1:s.peek();
                                System.out.print(pg+" ");
                                    s.push(arr[i]);

                    }

            }
                public static void main(String[] args) {
                    int arr[]={15,10,18,12,4,6,2,8};
                        previous_greater(arr);

                }
            




}
