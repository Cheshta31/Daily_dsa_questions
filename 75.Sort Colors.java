class Solution {
    public void sortColors(int[] nums) {
       int zero=0,one=0,two=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    zero++;
                }
                else if(nums[i]==1){
                    one++;
                }
                else {
                    two++;
                }
        }
        int k=0,n=nums.length;
        while(k<n)
      while(zero>0 || one>0 || two>0){
         if(zero>0){
            nums[k++]=0;
            zero--;
         }
         else if(one>0){
            nums[k++]=1;
            one--;
         }
         else{
            nums[k++]=2;
            two--;
         }
      }





    }
}
