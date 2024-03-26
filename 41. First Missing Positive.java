class Solution {
    public int firstMissingPositive(int[] nums) {

        if (nums.length == 1) {
            if (nums[0] >= 0 && nums[0] <= 1) {
                return nums[0] + 1;
            } else {
                return 1;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);

        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        for (int i = 1; i < max; i++) {
            if (!hs.contains(i)) {
                return i;
            }
        }

        return max < 0 ? 1 : max + 1;

    }
}
