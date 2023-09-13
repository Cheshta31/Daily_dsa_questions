https://leetcode.com/problems/detect-capital/description/
class Solution {
    public boolean detectCapitalUse(String word) {
        if((word.charAt(0)>=65 && word.charAt(0)<=90)){
            for(int i=2;i<word.length();i++){
                if((word.charAt(1)>=65 && word.charAt(1)<=90)){
                    if(!(word.charAt(i)>=65 && word.charAt(i)<=90)){
                        return false;
                    }
                    }
                    
                   if((word.charAt(1)>=97 && word.charAt(1)<=122)){
                    if(!(word.charAt(i)>=97 && word.charAt(i)<=122)){
                        return false;
                    }
                }
            }

        }
        if(word.charAt(0)>=97 && word.charAt(0)<=122){
            for(int i=1;i<word.length();i++){
                 if(!(word.charAt(i)>=97 && word.charAt(i)<=122)){
                        return false;
                    }
            }
        }
        return true;

    }
}
