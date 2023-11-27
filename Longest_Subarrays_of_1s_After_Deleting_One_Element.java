class Solution {
    public int longestSubarray(int[] nums) {
        int head=0,tail=0,len=0,count=0;

        for( head=0;head<nums.length;head++){
                        if(nums[head]==0){
                            count++;
                        }

                while(count>1){
                    if(nums[tail]==0){
                        count--;
                    }
                    tail++;
                }

len=Math.max(len,head-tail);
        }

        return len;
    }
}
