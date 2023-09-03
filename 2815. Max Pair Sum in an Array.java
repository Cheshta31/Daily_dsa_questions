https://leetcode.com/problems/max-pair-sum-in-an-array/description/
class Solution {
    public int maxSum(int[] nums) {
        
int ans=-1;
for(int i=0;i<nums.length;i++){
    String s=String.valueOf(nums[i]);
    char ch[]=s.toCharArray();
    Arrays.sort(ch);
    for(int j=i+1;j<nums.length;j++){
       String s1=String.valueOf(nums[j]);
    char ch1[]=s1.toCharArray();
    Arrays.sort(ch1); 
    if(ch[ch.length-1]==ch1[ch1.length-1]){
        ans=Math.max(ans,nums[i]+nums[j]);
    }
    } 
}
return ans;
    }
}
