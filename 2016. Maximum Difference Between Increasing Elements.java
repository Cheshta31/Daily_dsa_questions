class Solution {
    public int maximumDifference(int[] arr) {
        int n=arr.length;
        int res=arr[1]-arr[0];int minvalue=arr[0];
        for(int j=1;j<n;j++){
            res=Math.max(res,arr[j]-minvalue);
            minvalue=Math.min(minvalue,arr[j]);
        }
if(res<=0){
    return -1;
}
return res;


    }
}
