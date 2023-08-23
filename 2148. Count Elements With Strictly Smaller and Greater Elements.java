import java.util.Arrays;

class Solution {
    public int countElements(int[] nums) {

        Arrays.sort(nums);
        int k = 0;
        for(int i=1;i< nums.length-1;i++) {
            if(nums[i] > nums[0] && nums[i] < nums[nums.length-1]) k++;
        }
        return k;
    }
}
