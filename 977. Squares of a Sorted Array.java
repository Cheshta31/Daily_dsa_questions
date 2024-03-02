https://leetcode.com/problems/squares-of-a-sorted-array/solutions/4807634/beat-100-2-methods-c-java-python-o-n-with-explanation/

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            nums[i]=temp*temp;
        }
Arrays.sort(nums); 
       return nums;
    }
}
