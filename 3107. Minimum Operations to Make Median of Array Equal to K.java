class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int curr = 0;
        int n = nums.length;
        int idx = n / 2;
        long count = 0;
        
        curr = nums[n / 2];
        
        if(curr == k) {
            return count;
        } else if(curr > k) {
            while(idx >= 0 && nums[idx] > k) {
                count += nums[idx] - k;
                idx--;
            }
        } else if(curr < k) {
            while(idx < n && nums[idx] < k) {
                count += k - nums[idx];
                idx++;
            }
        }
        return count;
    }
}
