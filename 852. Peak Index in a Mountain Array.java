class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0,high=arr.length-1;int mid=0;
        while(high>low){
                mid=low+(high-low)/2;
                if(arr[mid-1]<arr[mid]&&arr[mid+1]<arr[mid]){
                    return mid;
                }
if(arr[mid+1]>arr[mid]){
 
    low=mid+1;
}
else{
     high=mid; 
}
        }
return mid-1;
    }
}
