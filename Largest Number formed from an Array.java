https://www.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1


class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        
        StringBuilder str=new StringBuilder();
        Arrays.sort(arr,(x,y)->(x+y).compareTo(y+x));
        
        for(int i=arr.length-1;i>=0;i--){
            str.append(arr[i]);
            
        }
        return str.toString();
    }
}
