https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/description/
import java.util.*;
class Solution {
    public boolean checkZeroOnes(String s) {
       int count_1=0;int count_0=0;int res0=0,res1=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count_1++;
                    
                    count_0=0;
                }
                else{
                            count_0++;
                            count_1=0;

                }
                 res1=Math.max(count_1,res1);
                res0=Math.max(count_0,res0);
            }
if(res1>res0){
    return true;
}

return false;

    }
}
