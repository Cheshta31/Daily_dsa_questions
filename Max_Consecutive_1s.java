class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                count++;
                for(int j=i+1;j<n;j++)
                {
                    if(nums[j]==1)
                    {
                        count++;
                    }
                    else
                    {
                        break;
                    }
                }
            res=Math.max(count,res);;
            count=0;
            }
        }
        return res;
    }
}
