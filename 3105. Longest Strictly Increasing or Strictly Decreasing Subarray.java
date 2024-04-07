class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increasing_length = 1, decreasing_length = 1;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                increasing_length++;
                decreasing_length = 1;
            } else if (nums[i] < nums[i - 1]) {
                decreasing_length++;
                increasing_length = 1;
            } else {
                increasing_length = 1;
                decreasing_length = 1;
            }
            res = Math.max(res, Math.max(increasing_length, decreasing_length));

        }

        return res;

    }
}
