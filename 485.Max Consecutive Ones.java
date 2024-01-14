https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=-1;
int count=0;
for(int i=0;i<nums.length;i++){
if(nums[i]==0){
    count=0;
}
else if(nums[i]==1)
count++;

max=Math.max(max,count);
}
return max;



    }
}
