question link-->>>https://leetcode.com/problems/trapping-rain-water/description/
class Solution {
    public int trap(int[] height) {
        int n=height.length;
         int lmax[]=new int[height.length];
         int rmax[]=new int[height.length];
         int res=0;
         lmax[0]=height[0];
        
         for(int i=1;i<height.length;i++){
                lmax[i]=Math.max(lmax[i-1],height[i]);
         }
         rmax[n-1]=height[n-1];

    for(int i=n-2 ;i>=0;i--){
        rmax[i]=Math.max(rmax[i+1],height[i]);
    }
    for(int i=0;i<n;i++){
        res+=(Math.min(rmax[i],lmax[i])-height[i]);
    }

return res;
    }
}
