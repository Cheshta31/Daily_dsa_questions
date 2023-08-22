question link-->>https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0,curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                curr=0;
            }

            else{
                curr++;
                res=Math.max(res,curr);
            }

        }
        return 
    }
}
