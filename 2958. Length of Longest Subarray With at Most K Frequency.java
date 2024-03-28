class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
int n=nums.length;
        int left=0,right=0,ans=Integer.MIN_VALUE;
        
        
for( right=0;right<n;right++){
hs.put(nums[right],hs.getOrDefault(nums[right],0)+1);
while(hs.get(nums[right])>k){
    hs.put(nums[left],hs.get(nums[left])-1);
    left++;
}
ans=Math.max(ans,right-left+1);

}

return ans;

    }
}
