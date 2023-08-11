class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(arr[arr.length-1]);
        int curr_ldr=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(curr_ldr<=arr[i]){
                curr_ldr=arr[i];
                al.add(curr_ldr);
            }
            
        }
         Collections.reverse(al);
        return  al;
        
    }
    
}
