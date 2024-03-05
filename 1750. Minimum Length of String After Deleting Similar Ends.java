https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/?envType=daily-question&envId=2024-03-05
class Solution {
    public int minimumLength(String s) {
        int left=0,right=s.length()-1;
        while(left<right && s.charAt(left)==s.charAt(right)){
char ch=s.charAt(left);
while( left<=right && s.charAt(left)==ch){
    left++;
}
while(left<=right && s.charAt(right)==ch){
    right--;
}

        }

return right-left<0?0:right-left+1;


    }
}
