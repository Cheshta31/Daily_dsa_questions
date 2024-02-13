class Solution {
    public int findNonMinOrMax(int[] nums) {
        
int max=-1;
int min=Integer.MAX_VALUE;
for(int i=0;i<nums.length;i++){
    if(nums[i]>max){
        max=nums[i];
    }
    if(nums[i]<min){
        min=nums[i];
    }

}

for(int i=0;i<nums.length;i++){
    if(nums[i]!=max && nums[i]!=min){
        return nums[i];
    }
}
return -1;
    }
}
