class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);int n=nums.length;int pos=0;
        if(nums.length==2)
        {
         return  Math.max(nums[0],nums[1]);
        }
        else if(nums.length==1)
        return nums[0];
        int count=0;
        for(int i=n-1;i>0;i--){

            if(nums[i] != nums[i-1]){
                count++;
            }
if (count==3){   
 pos=i;
break;
}
else if(i==1 && count!=2){
    return nums[n-1];
}
        }
    
    
return nums[pos];


    }
}
