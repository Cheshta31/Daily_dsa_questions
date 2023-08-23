class Solution {
    public int findSpecialInteger(int[] arr) {
    int n  =arr.length;
    int c = 0;
    if(n==1){
        return arr[0];
    }
    for(int i=0;i<n-n/4;i++){
    if(arr[i]==arr[i+n/4]){
        c = arr[i];
    }
    }
    return c;    
    }
}
