class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestsum = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int k = 0; k <= nums.length - 3; k++) {
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(target - sum) < Math.abs(target - closestsum))
                    closestsum = sum;

                if (sum < target)
                    i++;
                else
                    j--;

            }

        }
        return closestsum;

    }
}
