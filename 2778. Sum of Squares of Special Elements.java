class Solution {
    public int sumOfSquares(int[] nums) {
        int squaresum=0;int index=0;
        for(int i=1;i<=nums.length;i++){
            if((nums.length)%i==0){
               index=i-1;
                squaresum+=nums[index]*nums[index];
                }
            }
        
        return squaresum;
    }
}
