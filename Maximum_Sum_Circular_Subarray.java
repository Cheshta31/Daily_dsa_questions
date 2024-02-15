class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int nor_max=normal(nums,n);
        if(nor_max<0)
        {
            return nor_max;
        }
        int circular=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            nums[i] = -nums[i];
        }
        circular=sum+normal(nums,n);
        int ans=Math.max(circular,nor_max);
    return ans;
    }
    int normal(int nums[],int n)
    {
        int res=nums[0];
        int maxEnd=nums[0];
        for(int i=1;i<n;i++)
        {
            maxEnd=Math.max(nums[i],nums[i]+maxEnd);
        res=Math.max(res,maxEnd);
        }
    return res;
    }
}
