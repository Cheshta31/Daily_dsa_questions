class Solution {
    public int maxProduct(int[] nums) {
        
int currpro=1;int max=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++){
    currpro*=nums[i];

    if(currpro>max){
        max=currpro;
    }

    if(currpro<0){
        currpro=1;
    }
}
return max;

    }
}
