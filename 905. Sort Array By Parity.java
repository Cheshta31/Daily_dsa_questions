class Solution {
    public int[] sortArrayByParity(int[] nums) {
int p=0;int ans[]=new int[nums.length];
for(int i=0;i<nums.length;i++){
    if(nums[i]%2==0){
        ans[p]=nums[i];
        p++;

    }
}
for(int i=0;i<nums.length;i++){
    if(nums[i]%2!=0){
        ans[p]=nums[i];
        p++;

    }
}
return ans;
    
    }}
