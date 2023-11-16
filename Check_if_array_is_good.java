class Solution {
    public boolean isGood(int[] nums) {
        int max=-1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max){
                max=nums[i];
            }
        }

        if(nums.length!=max+1){
            return false;
        }

Arrays.sort(nums);
if(nums[nums.length-1]!=max){
    
    return false;
}
int k=0;
for(int i=1;i<=nums.length-1;i++,k++){
    if(nums[k]!=i){
        System.out.println("hello");
        return false;
    }
}

return true;

    }
}
