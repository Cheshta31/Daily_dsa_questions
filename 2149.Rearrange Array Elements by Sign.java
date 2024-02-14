class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int i = 0, pos = 0, neg = 1;
        while(i < n){
            if(nums[i++] > 0){
                output[pos] = nums[i - 1];
                pos += 2;
            }else{
                output[neg] = nums[i - 1];
                neg += 2;
            }
        }
        return output;
    }
}
