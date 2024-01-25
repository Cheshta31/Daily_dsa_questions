class Solution {
    public int[] rearrangeArray(int[] nums) {
        int negative[]=new int[nums.length/2+1];
        int positive[]=new int[nums.length/2+1];
        
int k=0,k1=0,k2=0,k3=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negative[k]=nums[i];
                k++;
            }
            else{
                positive[k1]=nums[i];
                k1++;
            }
        }
for(int i=0;i<nums.length;i++){
    if(i%2==0)
    {
        nums[i]=positive[k2++];
    }
    else{
        nums[i]=negative[k3++];
    }
}

return nums;
    }
}
