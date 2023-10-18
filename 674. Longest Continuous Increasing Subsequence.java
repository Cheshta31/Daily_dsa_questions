https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int count = 1;
        
        for(int i = 1 ; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                count++;
            } else {
                count = 1;
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
}
