class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,mn=Integer.MAX_VALUE;

while(j<nums.length){
sum+=nums[j];
while(sum>=target){
    sum-=nums[i];
    mn=Math.min(j-i+1,mn);
    i++;
}
j++;
}

if(mn==Integer.MAX_VALUE){
    return 0;
}
return mn;
    }
}
