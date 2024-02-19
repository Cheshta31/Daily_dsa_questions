https://leetcode.com/problems/power-of-two/?envType=daily-question&envId=2024-02-19

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }

        for(int i=0;i<31;i++){
            if(Math.pow(2,i)==n){
                return true;
            }
        }
return false;


    }
}
