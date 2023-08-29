https://leetcode.com/problems/sort-colors/description/
class Solution {
    public void sortColors(int[] nums) {
int c=0;int nums2[]=new int[nums.length];
for(int i=0;i<nums.length;i++){

nums2[i]=nums[i];
}
for(int i=0;i<nums.length;i++){
if(nums2[i]==0){
    nums[c]=nums2[i];
    c++;
}}
for(int i=0;i<nums.length;i++){
if(nums2[i]==1){
    nums[c]=nums2[i];
    c++;
}}

for(int i=0;i<nums.length;i++){
   // if(i==nums.length-1 )break;
if(nums2[i]==2){
    nums[c]=nums2[i];
    c++;
}

} 
    }
    }
   
    
    

    
