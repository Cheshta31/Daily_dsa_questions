class Solution {
    public boolean check(int[] nums) {
    int n=nums.length;
    int count=0;
    if(n==1)
    {
        return true;
    }
    else
    {
       for(int i=1;i<n;i++)
       {
        if(nums[i-1]>nums[i]) //rotated array
        {
            count++;// 1
        }
       }
       if(nums[n-1]>nums[0])
       {
        count++;// 2
       } 
       //sorted array
       if(count<=1) 
       {
           return true;
       }
    }
    return false;
    }
}
