class Solution {
    public int trap(int[] height) {
        int res=0;
        int n=height.length;
        for(int i=1;i<n-1;i++)
        {
             int lmax=height[i];
            for(int j=0;j<i;j++)
            {
                lmax=Math.max(height[j],lmax);
            }
            int rmax=height[i];
            for(int j=i+1;j<n;j++)
            {
                rmax=Math.max(height[j],rmax);
            }
            res=res+(Math.min(lmax,rmax))-height[i];
        }
    return res;
    }
}
