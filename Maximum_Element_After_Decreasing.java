class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        // if(arr[0]!=1){
        //     for(int i=1;i<arr.length;i++){
        //           if(arr[i]==1){
        //               int temp=arr[i];
        //               arr[i]=arr[0];
        //               arr[0]=temp;
        //               break;
        //           }}
        //} 
if(arr[0]!=1){
    arr[0]=1;
}
for(int i=1;i<arr.length;i++){
if(Math.abs(arr[i]-arr[i-1])>1){
    arr[i]=arr[i-1]+1;
}
}
int max=arr[0];
for(int i=1;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}



            
        

return max;

    }
}
