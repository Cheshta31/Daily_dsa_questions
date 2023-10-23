class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<=15;i++){
                int pow=(int) Math.pow(4,i);

                if(pow==n){
                    return true;
                }
                if(pow>n){
                    return false;
                }
        }
return false;
    }
}
