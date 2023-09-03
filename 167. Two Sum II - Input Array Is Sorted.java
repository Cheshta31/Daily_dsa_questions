https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int start =0;int end=nums.length-1;
       int ans[]=new int [2];
       while(start<end){
           if(nums[start]+nums[end]==target){
               break;
           }
           if(nums[start]+nums[end]>target){
               end--;
           }
           else{
               start++;
           }
       }
       ans[0]=start+1;
       ans[1]=end+1;
       return ans;
    }
}
