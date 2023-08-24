class Solution {
    public int largestRectangleArea(int[] arr) {
        int curr=0;
int res=0;
        for(int i=0;i<arr.length;i++){
                curr=arr[i];
                for(int j=i-1;j>=0;j--){
                    if(arr[j]>=arr[i])
                        curr+=arr[i];
                    else
                        break;
                    
                }
                for(int k=i+1;k<arr.length;k++){
                    if(arr[k]>=arr[i])
                        curr+=arr[i];                  
                    else
                        break;
                    
                }
                 res=Math.max(res,curr);

        }

return res;
    }
}
