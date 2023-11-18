class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
       int left=0,right=nums.length-1;int maxsumpair=-1;

       while(left<right){

           int currentsum=nums[left]+nums[right];


maxsumpair=Math.max(currentsum,maxsumpair);
left++;right--;



       }

return maxsumpair;

    }
}
