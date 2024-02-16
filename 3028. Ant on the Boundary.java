class Solution {
    public int returnToBoundaryCount(int[] nums) {
        
int sum=0,count=0;
for(int num:nums){
    sum+=num;
    if(sum==0){
        count+=1;

    }
}


return count;
    }
}
