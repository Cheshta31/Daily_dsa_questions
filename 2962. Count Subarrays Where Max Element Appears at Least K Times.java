class Solution {
    public long countSubarrays(int[] nums, int k) {
        int i = 0, j = 0, n = nums.length;
        int maxE = 0, count = 0;
        long result = 0;
        for (int l = 0; l < n; l++) {
            maxE = Math.max(nums[l], maxE);
        }
        while (j < n) {
            if (nums[j] == maxE) {
                count++;
            }

            while (count >= k) {

                result += n - j;
                if (nums[i] == maxE) {
                    count--;
                }
                i++;

            }
            j++;
        }
        return result;

    }
}
