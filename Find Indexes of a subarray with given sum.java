class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        // Your code here
        int index[]={-1,-1};
        int i=0,j=0;
        int currsum=0;
        while(j<n){
            currsum+=arr[j];
           
            while(currsum>s){
                currsum-=arr[i];
                i++;
            }
            
            if(currsum==s && i<=j){
               al.add(i+1);al.add(j+1);
               return al;
            }
            j++;
            
        }
        al.add(-1);
        return al;
        
        
        
    }
}
