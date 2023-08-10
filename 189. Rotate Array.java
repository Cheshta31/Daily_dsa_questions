class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k %= n; // In case k is larger than the length of the array, take the modulo.

        // Reverse the first n-k elements.
        reverseArray(nums, 0, n - k - 1);

        // Reverse the rest elements.
        reverseArray(nums, n - k, n - 1);

        // Reverse the entire array.
        reverseArray(nums, 0, n - 1);
    }
    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }}
